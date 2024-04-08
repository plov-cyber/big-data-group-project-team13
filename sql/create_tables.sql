START TRANSACTION;

-- Tables creation

-- acquisitions table
DROP TABLE IF EXISTS acquisitions CASCADE;
CREATE TABLE acquisitions
(
    id                  SERIAL              NOT NULL,
    acquisition_id      INTEGER PRIMARY KEY NOT NULL,
    acquiring_object_id VARCHAR(255),
    acquired_object_id  VARCHAR(255),
    term_code           VARCHAR(255),
    price_amount        NUMERIC(19, 2),
    price_currency_code VARCHAR(3),
    acquired_at         DATE,
    source_url          TEXT,
    source_description  TEXT,
    created_at          TIMESTAMP,
    updated_at          TIMESTAMP
);

-- objects table
DROP TABLE IF EXISTS objects CASCADE;
CREATE TABLE objects
(
    id                  VARCHAR(255) PRIMARY KEY NOT NULL,
    entity_type         VARCHAR(50),
    entity_id           BIGINT,
    parent_id           VARCHAR(255),
    name                VARCHAR(1024),
    normalized_name     VARCHAR(255),
    permalink           VARCHAR(255),
    category_code       VARCHAR(50),
    status              VARCHAR(50),
    founded_at          DATE,
    closed_at           DATE,
    domain              VARCHAR(255),
    homepage_url        VARCHAR(500),
    twitter_username    VARCHAR(50),
    logo_url            VARCHAR(500),
    logo_width          SMALLINT,
    logo_height         SMALLINT,
    short_description   TEXT,
    description         TEXT,
    overview            TEXT,
    tag_list            TEXT,
    country_code        VARCHAR(3),
    state_code          VARCHAR(2),
    city                VARCHAR(255),
    region              VARCHAR(255),
    first_investment_at DATE,
    last_investment_at  DATE,
    investment_rounds   SMALLINT,
    invested_companies  SMALLINT,
    first_funding_at    DATE,
    last_funding_at     DATE,
    funding_rounds      SMALLINT,
    funding_total_usd   NUMERIC(19, 2),
    first_milestone_at  DATE,
    last_milestone_at   DATE,
    milestones          SMALLINT,
    relationships       SMALLINT,
    created_by          VARCHAR(255),
    created_at          TIMESTAMP,
    updated_at          TIMESTAMP
);

-- people table
DROP TABLE IF EXISTS people CASCADE;
CREATE TABLE people
(
    id               SERIAL                  NOT NULL,
    object_id        VARCHAR(10) PRIMARY KEY NOT NULL,
    first_name       VARCHAR(255),
    last_name        VARCHAR(255),
    birthplace       VARCHAR(255),
    affiliation_name VARCHAR(255)
);

-- offices table
DROP TABLE IF EXISTS offices CASCADE;
CREATE TABLE offices
(
    id           SERIAL              NOT NULL,
    object_id    VARCHAR(255),
    office_id    INTEGER PRIMARY KEY NOT NULL,
    description  TEXT,
    region       VARCHAR(255),
    address1     TEXT,
    address2     TEXT,
    city         VARCHAR(255),
    zip_code     VARCHAR(255),
    state_code   VARCHAR(2),
    country_code VARCHAR(3),
    latitude     DOUBLE PRECISION,
    longitude    DOUBLE PRECISION,
    created_at   TIMESTAMP,
    updated_at   TIMESTAMP
);

-- relationships table
DROP TABLE IF EXISTS relationships CASCADE;
CREATE TABLE relationships
(
    id                     SERIAL             NOT NULL,
    relationship_id        BIGINT PRIMARY KEY NOT NULL,
    person_object_id       VARCHAR(255),
    relationship_object_id VARCHAR(255),
    start_at               DATE,
    end_at                 DATE,
    is_past                BOOLEAN,
    sequence               BIGINT,
    title                  TEXT,
    created_at             TIMESTAMP,
    updated_at             TIMESTAMP
);

-- milestones table
DROP TABLE IF EXISTS milestones CASCADE;
CREATE TABLE milestones
(
    id                 SERIAL PRIMARY KEY NOT NULL,
    object_id          VARCHAR(255),
    milestone_at       DATE,
    milestone_code     VARCHAR(255),
    description        TEXT,
    source_url         TEXT,
    source_description TEXT,
    created_at         TIMESTAMP,
    updated_at         TIMESTAMP
);

-- ipos table
DROP TABLE IF EXISTS ipos CASCADE;
CREATE TABLE ipos
(
    id                      SERIAL             NOT NULL,
    ipo_id                  BIGINT PRIMARY KEY NOT NULL,
    object_id               VARCHAR(255),
    valuation_amount        NUMERIC(19, 2),
    valuation_currency_code VARCHAR(3),
    raised_amount           NUMERIC(19, 2),
    raised_currency_code    VARCHAR(3),
    public_at               DATE,
    stock_symbol            VARCHAR(255),
    source_url              TEXT,
    source_description      TEXT,
    created_at              TIMESTAMP,
    updated_at              TIMESTAMP
);

-- degrees table
DROP TABLE IF EXISTS degrees CASCADE;
CREATE TABLE degrees
(
    id           SERIAL PRIMARY KEY NOT NULL,
    object_id    VARCHAR(255),
    degree_type  VARCHAR(255),
    subject      TEXT,
    institution  VARCHAR(255),
    graduated_at DATE,
    created_at   TIMESTAMP,
    updated_at   TIMESTAMP
);

-- investments table
DROP TABLE IF EXISTS investments CASCADE;
CREATE TABLE investments
(
    id                 SERIAL PRIMARY KEY NOT NULL,
    funding_round_id   INTEGER,
    funded_object_id   VARCHAR(255),
    investor_object_id VARCHAR(255),
    created_at         TIMESTAMP,
    updated_at         TIMESTAMP
);

-- funds table
DROP TABLE IF EXISTS funds CASCADE;
CREATE TABLE funds
(
    id                   INTEGER             NOT NULL,
    fund_id              INTEGER PRIMARY KEY NOT NULL,
    object_id            VARCHAR(255),
    name                 TEXT,
    funded_at            DATE,
    raised_amount        NUMERIC(19, 2),
    raised_currency_code VARCHAR(3),
    source_url           TEXT,
    source_description   TEXT,
    created_at           TIMESTAMP,
    updated_at           TIMESTAMP
);

-- funding_rounds table
DROP TABLE IF EXISTS funding_rounds CASCADE;
CREATE TABLE funding_rounds
(
    id                       SERIAL             NOT NULL,
    funding_round_id         BIGINT PRIMARY KEY NOT NULL,
    object_id                VARCHAR(255),
    funded_at                DATE,
    funding_round_type       VARCHAR(255),
    funding_round_code       VARCHAR(255),
    raised_amount_usd        NUMERIC(19, 2),
    raised_amount            NUMERIC(19, 2),
    raised_currency_code     VARCHAR(3),
    pre_money_valuation_usd  NUMERIC(19, 2),
    pre_money_valuation      NUMERIC(19, 2),
    pre_money_currency_code  VARCHAR(3),
    post_money_valuation_usd NUMERIC(19, 2),
    post_money_valuation     NUMERIC(19, 2),
    post_money_currency_code VARCHAR(3),
    participants             SMALLINT,
    is_first_round           SMALLINT,
    is_last_round            SMALLINT,
    source_url               TEXT,
    source_description       TEXT,
    created_by               VARCHAR(255),
    created_at               TIMESTAMP,
    updated_at               TIMESTAMP
);


-- Foreign key constraints

-- acquisitions table
ALTER TABLE acquisitions
    ADD CONSTRAINT fk_acquisitions_objects1
        FOREIGN KEY (acquiring_object_id)
            REFERENCES objects (id);

ALTER TABLE acquisitions
    ADD CONSTRAINT fk_acquisitions_objects2
        FOREIGN KEY (acquired_object_id)
            REFERENCES objects (id);

-- relationships table
ALTER TABLE relationships
    ADD CONSTRAINT fk_relationships_people
        FOREIGN KEY (person_object_id)
            REFERENCES people (object_id);

ALTER TABLE relationships
    ADD CONSTRAINT fk_relationships_objects
        FOREIGN KEY (relationship_object_id)
            REFERENCES objects (id);

-- milestones table
ALTER TABLE milestones
    ADD CONSTRAINT fk_milestones_objects
        FOREIGN KEY (object_id)
            REFERENCES objects (id);

-- ipos table
ALTER TABLE ipos
    ADD CONSTRAINT fk_ipos_objects
        FOREIGN KEY (object_id)
            REFERENCES objects (id);

-- degrees table
ALTER TABLE degrees
    ADD CONSTRAINT fk_degrees_people
        FOREIGN KEY (object_id)
            REFERENCES people (object_id);

-- investments table
ALTER TABLE investments
    ADD CONSTRAINT fk_investments_funding_rounds
        FOREIGN KEY (funding_round_id)
            REFERENCES funding_rounds (funding_round_id);

ALTER TABLE investments
    ADD CONSTRAINT fk_investments_objects1
        FOREIGN KEY (funded_object_id)
            REFERENCES objects (id);

ALTER TABLE investments
    ADD CONSTRAINT fk_investments_objects2
        FOREIGN KEY (investor_object_id)
            REFERENCES objects (id);

-- funds table
ALTER TABLE funds
    ADD CONSTRAINT fk_funds_objects
        FOREIGN KEY (object_id)
            REFERENCES objects (id);

-- funding_rounds table
ALTER TABLE funding_rounds
    ADD CONSTRAINT fk_funding_rounds_objects
        FOREIGN KEY (object_id)
            REFERENCES objects (id);