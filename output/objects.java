// ORM class for table 'objects'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun May 12 11:43:26 MSK 2024
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class objects extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.id = (String)value;
      }
    });
    setters.put("entity_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.entity_type = (String)value;
      }
    });
    setters.put("entity_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.entity_id = (Long)value;
      }
    });
    setters.put("parent_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.parent_id = (String)value;
      }
    });
    setters.put("name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.name = (String)value;
      }
    });
    setters.put("normalized_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.normalized_name = (String)value;
      }
    });
    setters.put("permalink", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.permalink = (String)value;
      }
    });
    setters.put("category_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.category_code = (String)value;
      }
    });
    setters.put("status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.status = (String)value;
      }
    });
    setters.put("founded_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.founded_at = (java.sql.Date)value;
      }
    });
    setters.put("closed_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.closed_at = (java.sql.Date)value;
      }
    });
    setters.put("domain", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.domain = (String)value;
      }
    });
    setters.put("homepage_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.homepage_url = (String)value;
      }
    });
    setters.put("twitter_username", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.twitter_username = (String)value;
      }
    });
    setters.put("logo_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.logo_url = (String)value;
      }
    });
    setters.put("logo_width", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.logo_width = (Integer)value;
      }
    });
    setters.put("logo_height", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.logo_height = (Integer)value;
      }
    });
    setters.put("short_description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.short_description = (String)value;
      }
    });
    setters.put("description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.description = (String)value;
      }
    });
    setters.put("overview", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.overview = (String)value;
      }
    });
    setters.put("tag_list", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.tag_list = (String)value;
      }
    });
    setters.put("country_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.country_code = (String)value;
      }
    });
    setters.put("state_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.state_code = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.city = (String)value;
      }
    });
    setters.put("region", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.region = (String)value;
      }
    });
    setters.put("first_investment_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.first_investment_at = (java.sql.Date)value;
      }
    });
    setters.put("last_investment_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.last_investment_at = (java.sql.Date)value;
      }
    });
    setters.put("investment_rounds", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.investment_rounds = (Integer)value;
      }
    });
    setters.put("invested_companies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.invested_companies = (Integer)value;
      }
    });
    setters.put("first_funding_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.first_funding_at = (java.sql.Date)value;
      }
    });
    setters.put("last_funding_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.last_funding_at = (java.sql.Date)value;
      }
    });
    setters.put("funding_rounds", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.funding_rounds = (Integer)value;
      }
    });
    setters.put("funding_total_usd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.funding_total_usd = (java.math.BigDecimal)value;
      }
    });
    setters.put("first_milestone_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.first_milestone_at = (java.sql.Date)value;
      }
    });
    setters.put("last_milestone_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.last_milestone_at = (java.sql.Date)value;
      }
    });
    setters.put("milestones", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.milestones = (Integer)value;
      }
    });
    setters.put("relationships", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.relationships = (Integer)value;
      }
    });
    setters.put("created_by", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.created_by = (String)value;
      }
    });
    setters.put("created_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.created_at = (java.sql.Timestamp)value;
      }
    });
    setters.put("updated_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        objects.this.updated_at = (java.sql.Timestamp)value;
      }
    });
  }
  public objects() {
    init0();
  }
  private String id;
  public String get_id() {
    return id;
  }
  public void set_id(String id) {
    this.id = id;
  }
  public objects with_id(String id) {
    this.id = id;
    return this;
  }
  private String entity_type;
  public String get_entity_type() {
    return entity_type;
  }
  public void set_entity_type(String entity_type) {
    this.entity_type = entity_type;
  }
  public objects with_entity_type(String entity_type) {
    this.entity_type = entity_type;
    return this;
  }
  private Long entity_id;
  public Long get_entity_id() {
    return entity_id;
  }
  public void set_entity_id(Long entity_id) {
    this.entity_id = entity_id;
  }
  public objects with_entity_id(Long entity_id) {
    this.entity_id = entity_id;
    return this;
  }
  private String parent_id;
  public String get_parent_id() {
    return parent_id;
  }
  public void set_parent_id(String parent_id) {
    this.parent_id = parent_id;
  }
  public objects with_parent_id(String parent_id) {
    this.parent_id = parent_id;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public objects with_name(String name) {
    this.name = name;
    return this;
  }
  private String normalized_name;
  public String get_normalized_name() {
    return normalized_name;
  }
  public void set_normalized_name(String normalized_name) {
    this.normalized_name = normalized_name;
  }
  public objects with_normalized_name(String normalized_name) {
    this.normalized_name = normalized_name;
    return this;
  }
  private String permalink;
  public String get_permalink() {
    return permalink;
  }
  public void set_permalink(String permalink) {
    this.permalink = permalink;
  }
  public objects with_permalink(String permalink) {
    this.permalink = permalink;
    return this;
  }
  private String category_code;
  public String get_category_code() {
    return category_code;
  }
  public void set_category_code(String category_code) {
    this.category_code = category_code;
  }
  public objects with_category_code(String category_code) {
    this.category_code = category_code;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public objects with_status(String status) {
    this.status = status;
    return this;
  }
  private java.sql.Date founded_at;
  public java.sql.Date get_founded_at() {
    return founded_at;
  }
  public void set_founded_at(java.sql.Date founded_at) {
    this.founded_at = founded_at;
  }
  public objects with_founded_at(java.sql.Date founded_at) {
    this.founded_at = founded_at;
    return this;
  }
  private java.sql.Date closed_at;
  public java.sql.Date get_closed_at() {
    return closed_at;
  }
  public void set_closed_at(java.sql.Date closed_at) {
    this.closed_at = closed_at;
  }
  public objects with_closed_at(java.sql.Date closed_at) {
    this.closed_at = closed_at;
    return this;
  }
  private String domain;
  public String get_domain() {
    return domain;
  }
  public void set_domain(String domain) {
    this.domain = domain;
  }
  public objects with_domain(String domain) {
    this.domain = domain;
    return this;
  }
  private String homepage_url;
  public String get_homepage_url() {
    return homepage_url;
  }
  public void set_homepage_url(String homepage_url) {
    this.homepage_url = homepage_url;
  }
  public objects with_homepage_url(String homepage_url) {
    this.homepage_url = homepage_url;
    return this;
  }
  private String twitter_username;
  public String get_twitter_username() {
    return twitter_username;
  }
  public void set_twitter_username(String twitter_username) {
    this.twitter_username = twitter_username;
  }
  public objects with_twitter_username(String twitter_username) {
    this.twitter_username = twitter_username;
    return this;
  }
  private String logo_url;
  public String get_logo_url() {
    return logo_url;
  }
  public void set_logo_url(String logo_url) {
    this.logo_url = logo_url;
  }
  public objects with_logo_url(String logo_url) {
    this.logo_url = logo_url;
    return this;
  }
  private Integer logo_width;
  public Integer get_logo_width() {
    return logo_width;
  }
  public void set_logo_width(Integer logo_width) {
    this.logo_width = logo_width;
  }
  public objects with_logo_width(Integer logo_width) {
    this.logo_width = logo_width;
    return this;
  }
  private Integer logo_height;
  public Integer get_logo_height() {
    return logo_height;
  }
  public void set_logo_height(Integer logo_height) {
    this.logo_height = logo_height;
  }
  public objects with_logo_height(Integer logo_height) {
    this.logo_height = logo_height;
    return this;
  }
  private String short_description;
  public String get_short_description() {
    return short_description;
  }
  public void set_short_description(String short_description) {
    this.short_description = short_description;
  }
  public objects with_short_description(String short_description) {
    this.short_description = short_description;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public objects with_description(String description) {
    this.description = description;
    return this;
  }
  private String overview;
  public String get_overview() {
    return overview;
  }
  public void set_overview(String overview) {
    this.overview = overview;
  }
  public objects with_overview(String overview) {
    this.overview = overview;
    return this;
  }
  private String tag_list;
  public String get_tag_list() {
    return tag_list;
  }
  public void set_tag_list(String tag_list) {
    this.tag_list = tag_list;
  }
  public objects with_tag_list(String tag_list) {
    this.tag_list = tag_list;
    return this;
  }
  private String country_code;
  public String get_country_code() {
    return country_code;
  }
  public void set_country_code(String country_code) {
    this.country_code = country_code;
  }
  public objects with_country_code(String country_code) {
    this.country_code = country_code;
    return this;
  }
  private String state_code;
  public String get_state_code() {
    return state_code;
  }
  public void set_state_code(String state_code) {
    this.state_code = state_code;
  }
  public objects with_state_code(String state_code) {
    this.state_code = state_code;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public objects with_city(String city) {
    this.city = city;
    return this;
  }
  private String region;
  public String get_region() {
    return region;
  }
  public void set_region(String region) {
    this.region = region;
  }
  public objects with_region(String region) {
    this.region = region;
    return this;
  }
  private java.sql.Date first_investment_at;
  public java.sql.Date get_first_investment_at() {
    return first_investment_at;
  }
  public void set_first_investment_at(java.sql.Date first_investment_at) {
    this.first_investment_at = first_investment_at;
  }
  public objects with_first_investment_at(java.sql.Date first_investment_at) {
    this.first_investment_at = first_investment_at;
    return this;
  }
  private java.sql.Date last_investment_at;
  public java.sql.Date get_last_investment_at() {
    return last_investment_at;
  }
  public void set_last_investment_at(java.sql.Date last_investment_at) {
    this.last_investment_at = last_investment_at;
  }
  public objects with_last_investment_at(java.sql.Date last_investment_at) {
    this.last_investment_at = last_investment_at;
    return this;
  }
  private Integer investment_rounds;
  public Integer get_investment_rounds() {
    return investment_rounds;
  }
  public void set_investment_rounds(Integer investment_rounds) {
    this.investment_rounds = investment_rounds;
  }
  public objects with_investment_rounds(Integer investment_rounds) {
    this.investment_rounds = investment_rounds;
    return this;
  }
  private Integer invested_companies;
  public Integer get_invested_companies() {
    return invested_companies;
  }
  public void set_invested_companies(Integer invested_companies) {
    this.invested_companies = invested_companies;
  }
  public objects with_invested_companies(Integer invested_companies) {
    this.invested_companies = invested_companies;
    return this;
  }
  private java.sql.Date first_funding_at;
  public java.sql.Date get_first_funding_at() {
    return first_funding_at;
  }
  public void set_first_funding_at(java.sql.Date first_funding_at) {
    this.first_funding_at = first_funding_at;
  }
  public objects with_first_funding_at(java.sql.Date first_funding_at) {
    this.first_funding_at = first_funding_at;
    return this;
  }
  private java.sql.Date last_funding_at;
  public java.sql.Date get_last_funding_at() {
    return last_funding_at;
  }
  public void set_last_funding_at(java.sql.Date last_funding_at) {
    this.last_funding_at = last_funding_at;
  }
  public objects with_last_funding_at(java.sql.Date last_funding_at) {
    this.last_funding_at = last_funding_at;
    return this;
  }
  private Integer funding_rounds;
  public Integer get_funding_rounds() {
    return funding_rounds;
  }
  public void set_funding_rounds(Integer funding_rounds) {
    this.funding_rounds = funding_rounds;
  }
  public objects with_funding_rounds(Integer funding_rounds) {
    this.funding_rounds = funding_rounds;
    return this;
  }
  private java.math.BigDecimal funding_total_usd;
  public java.math.BigDecimal get_funding_total_usd() {
    return funding_total_usd;
  }
  public void set_funding_total_usd(java.math.BigDecimal funding_total_usd) {
    this.funding_total_usd = funding_total_usd;
  }
  public objects with_funding_total_usd(java.math.BigDecimal funding_total_usd) {
    this.funding_total_usd = funding_total_usd;
    return this;
  }
  private java.sql.Date first_milestone_at;
  public java.sql.Date get_first_milestone_at() {
    return first_milestone_at;
  }
  public void set_first_milestone_at(java.sql.Date first_milestone_at) {
    this.first_milestone_at = first_milestone_at;
  }
  public objects with_first_milestone_at(java.sql.Date first_milestone_at) {
    this.first_milestone_at = first_milestone_at;
    return this;
  }
  private java.sql.Date last_milestone_at;
  public java.sql.Date get_last_milestone_at() {
    return last_milestone_at;
  }
  public void set_last_milestone_at(java.sql.Date last_milestone_at) {
    this.last_milestone_at = last_milestone_at;
  }
  public objects with_last_milestone_at(java.sql.Date last_milestone_at) {
    this.last_milestone_at = last_milestone_at;
    return this;
  }
  private Integer milestones;
  public Integer get_milestones() {
    return milestones;
  }
  public void set_milestones(Integer milestones) {
    this.milestones = milestones;
  }
  public objects with_milestones(Integer milestones) {
    this.milestones = milestones;
    return this;
  }
  private Integer relationships;
  public Integer get_relationships() {
    return relationships;
  }
  public void set_relationships(Integer relationships) {
    this.relationships = relationships;
  }
  public objects with_relationships(Integer relationships) {
    this.relationships = relationships;
    return this;
  }
  private String created_by;
  public String get_created_by() {
    return created_by;
  }
  public void set_created_by(String created_by) {
    this.created_by = created_by;
  }
  public objects with_created_by(String created_by) {
    this.created_by = created_by;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public objects with_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
    return this;
  }
  private java.sql.Timestamp updated_at;
  public java.sql.Timestamp get_updated_at() {
    return updated_at;
  }
  public void set_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
  }
  public objects with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof objects)) {
      return false;
    }
    objects that = (objects) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.entity_type == null ? that.entity_type == null : this.entity_type.equals(that.entity_type));
    equal = equal && (this.entity_id == null ? that.entity_id == null : this.entity_id.equals(that.entity_id));
    equal = equal && (this.parent_id == null ? that.parent_id == null : this.parent_id.equals(that.parent_id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.normalized_name == null ? that.normalized_name == null : this.normalized_name.equals(that.normalized_name));
    equal = equal && (this.permalink == null ? that.permalink == null : this.permalink.equals(that.permalink));
    equal = equal && (this.category_code == null ? that.category_code == null : this.category_code.equals(that.category_code));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.founded_at == null ? that.founded_at == null : this.founded_at.equals(that.founded_at));
    equal = equal && (this.closed_at == null ? that.closed_at == null : this.closed_at.equals(that.closed_at));
    equal = equal && (this.domain == null ? that.domain == null : this.domain.equals(that.domain));
    equal = equal && (this.homepage_url == null ? that.homepage_url == null : this.homepage_url.equals(that.homepage_url));
    equal = equal && (this.twitter_username == null ? that.twitter_username == null : this.twitter_username.equals(that.twitter_username));
    equal = equal && (this.logo_url == null ? that.logo_url == null : this.logo_url.equals(that.logo_url));
    equal = equal && (this.logo_width == null ? that.logo_width == null : this.logo_width.equals(that.logo_width));
    equal = equal && (this.logo_height == null ? that.logo_height == null : this.logo_height.equals(that.logo_height));
    equal = equal && (this.short_description == null ? that.short_description == null : this.short_description.equals(that.short_description));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.overview == null ? that.overview == null : this.overview.equals(that.overview));
    equal = equal && (this.tag_list == null ? that.tag_list == null : this.tag_list.equals(that.tag_list));
    equal = equal && (this.country_code == null ? that.country_code == null : this.country_code.equals(that.country_code));
    equal = equal && (this.state_code == null ? that.state_code == null : this.state_code.equals(that.state_code));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.region == null ? that.region == null : this.region.equals(that.region));
    equal = equal && (this.first_investment_at == null ? that.first_investment_at == null : this.first_investment_at.equals(that.first_investment_at));
    equal = equal && (this.last_investment_at == null ? that.last_investment_at == null : this.last_investment_at.equals(that.last_investment_at));
    equal = equal && (this.investment_rounds == null ? that.investment_rounds == null : this.investment_rounds.equals(that.investment_rounds));
    equal = equal && (this.invested_companies == null ? that.invested_companies == null : this.invested_companies.equals(that.invested_companies));
    equal = equal && (this.first_funding_at == null ? that.first_funding_at == null : this.first_funding_at.equals(that.first_funding_at));
    equal = equal && (this.last_funding_at == null ? that.last_funding_at == null : this.last_funding_at.equals(that.last_funding_at));
    equal = equal && (this.funding_rounds == null ? that.funding_rounds == null : this.funding_rounds.equals(that.funding_rounds));
    equal = equal && (this.funding_total_usd == null ? that.funding_total_usd == null : this.funding_total_usd.equals(that.funding_total_usd));
    equal = equal && (this.first_milestone_at == null ? that.first_milestone_at == null : this.first_milestone_at.equals(that.first_milestone_at));
    equal = equal && (this.last_milestone_at == null ? that.last_milestone_at == null : this.last_milestone_at.equals(that.last_milestone_at));
    equal = equal && (this.milestones == null ? that.milestones == null : this.milestones.equals(that.milestones));
    equal = equal && (this.relationships == null ? that.relationships == null : this.relationships.equals(that.relationships));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof objects)) {
      return false;
    }
    objects that = (objects) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.entity_type == null ? that.entity_type == null : this.entity_type.equals(that.entity_type));
    equal = equal && (this.entity_id == null ? that.entity_id == null : this.entity_id.equals(that.entity_id));
    equal = equal && (this.parent_id == null ? that.parent_id == null : this.parent_id.equals(that.parent_id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.normalized_name == null ? that.normalized_name == null : this.normalized_name.equals(that.normalized_name));
    equal = equal && (this.permalink == null ? that.permalink == null : this.permalink.equals(that.permalink));
    equal = equal && (this.category_code == null ? that.category_code == null : this.category_code.equals(that.category_code));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.founded_at == null ? that.founded_at == null : this.founded_at.equals(that.founded_at));
    equal = equal && (this.closed_at == null ? that.closed_at == null : this.closed_at.equals(that.closed_at));
    equal = equal && (this.domain == null ? that.domain == null : this.domain.equals(that.domain));
    equal = equal && (this.homepage_url == null ? that.homepage_url == null : this.homepage_url.equals(that.homepage_url));
    equal = equal && (this.twitter_username == null ? that.twitter_username == null : this.twitter_username.equals(that.twitter_username));
    equal = equal && (this.logo_url == null ? that.logo_url == null : this.logo_url.equals(that.logo_url));
    equal = equal && (this.logo_width == null ? that.logo_width == null : this.logo_width.equals(that.logo_width));
    equal = equal && (this.logo_height == null ? that.logo_height == null : this.logo_height.equals(that.logo_height));
    equal = equal && (this.short_description == null ? that.short_description == null : this.short_description.equals(that.short_description));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.overview == null ? that.overview == null : this.overview.equals(that.overview));
    equal = equal && (this.tag_list == null ? that.tag_list == null : this.tag_list.equals(that.tag_list));
    equal = equal && (this.country_code == null ? that.country_code == null : this.country_code.equals(that.country_code));
    equal = equal && (this.state_code == null ? that.state_code == null : this.state_code.equals(that.state_code));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.region == null ? that.region == null : this.region.equals(that.region));
    equal = equal && (this.first_investment_at == null ? that.first_investment_at == null : this.first_investment_at.equals(that.first_investment_at));
    equal = equal && (this.last_investment_at == null ? that.last_investment_at == null : this.last_investment_at.equals(that.last_investment_at));
    equal = equal && (this.investment_rounds == null ? that.investment_rounds == null : this.investment_rounds.equals(that.investment_rounds));
    equal = equal && (this.invested_companies == null ? that.invested_companies == null : this.invested_companies.equals(that.invested_companies));
    equal = equal && (this.first_funding_at == null ? that.first_funding_at == null : this.first_funding_at.equals(that.first_funding_at));
    equal = equal && (this.last_funding_at == null ? that.last_funding_at == null : this.last_funding_at.equals(that.last_funding_at));
    equal = equal && (this.funding_rounds == null ? that.funding_rounds == null : this.funding_rounds.equals(that.funding_rounds));
    equal = equal && (this.funding_total_usd == null ? that.funding_total_usd == null : this.funding_total_usd.equals(that.funding_total_usd));
    equal = equal && (this.first_milestone_at == null ? that.first_milestone_at == null : this.first_milestone_at.equals(that.first_milestone_at));
    equal = equal && (this.last_milestone_at == null ? that.last_milestone_at == null : this.last_milestone_at.equals(that.last_milestone_at));
    equal = equal && (this.milestones == null ? that.milestones == null : this.milestones.equals(that.milestones));
    equal = equal && (this.relationships == null ? that.relationships == null : this.relationships.equals(that.relationships));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.entity_type = JdbcWritableBridge.readString(2, __dbResults);
    this.entity_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.parent_id = JdbcWritableBridge.readString(4, __dbResults);
    this.name = JdbcWritableBridge.readString(5, __dbResults);
    this.normalized_name = JdbcWritableBridge.readString(6, __dbResults);
    this.permalink = JdbcWritableBridge.readString(7, __dbResults);
    this.category_code = JdbcWritableBridge.readString(8, __dbResults);
    this.status = JdbcWritableBridge.readString(9, __dbResults);
    this.founded_at = JdbcWritableBridge.readDate(10, __dbResults);
    this.closed_at = JdbcWritableBridge.readDate(11, __dbResults);
    this.domain = JdbcWritableBridge.readString(12, __dbResults);
    this.homepage_url = JdbcWritableBridge.readString(13, __dbResults);
    this.twitter_username = JdbcWritableBridge.readString(14, __dbResults);
    this.logo_url = JdbcWritableBridge.readString(15, __dbResults);
    this.logo_width = JdbcWritableBridge.readInteger(16, __dbResults);
    this.logo_height = JdbcWritableBridge.readInteger(17, __dbResults);
    this.short_description = JdbcWritableBridge.readString(18, __dbResults);
    this.description = JdbcWritableBridge.readString(19, __dbResults);
    this.overview = JdbcWritableBridge.readString(20, __dbResults);
    this.tag_list = JdbcWritableBridge.readString(21, __dbResults);
    this.country_code = JdbcWritableBridge.readString(22, __dbResults);
    this.state_code = JdbcWritableBridge.readString(23, __dbResults);
    this.city = JdbcWritableBridge.readString(24, __dbResults);
    this.region = JdbcWritableBridge.readString(25, __dbResults);
    this.first_investment_at = JdbcWritableBridge.readDate(26, __dbResults);
    this.last_investment_at = JdbcWritableBridge.readDate(27, __dbResults);
    this.investment_rounds = JdbcWritableBridge.readInteger(28, __dbResults);
    this.invested_companies = JdbcWritableBridge.readInteger(29, __dbResults);
    this.first_funding_at = JdbcWritableBridge.readDate(30, __dbResults);
    this.last_funding_at = JdbcWritableBridge.readDate(31, __dbResults);
    this.funding_rounds = JdbcWritableBridge.readInteger(32, __dbResults);
    this.funding_total_usd = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.first_milestone_at = JdbcWritableBridge.readDate(34, __dbResults);
    this.last_milestone_at = JdbcWritableBridge.readDate(35, __dbResults);
    this.milestones = JdbcWritableBridge.readInteger(36, __dbResults);
    this.relationships = JdbcWritableBridge.readInteger(37, __dbResults);
    this.created_by = JdbcWritableBridge.readString(38, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(39, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(40, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.entity_type = JdbcWritableBridge.readString(2, __dbResults);
    this.entity_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.parent_id = JdbcWritableBridge.readString(4, __dbResults);
    this.name = JdbcWritableBridge.readString(5, __dbResults);
    this.normalized_name = JdbcWritableBridge.readString(6, __dbResults);
    this.permalink = JdbcWritableBridge.readString(7, __dbResults);
    this.category_code = JdbcWritableBridge.readString(8, __dbResults);
    this.status = JdbcWritableBridge.readString(9, __dbResults);
    this.founded_at = JdbcWritableBridge.readDate(10, __dbResults);
    this.closed_at = JdbcWritableBridge.readDate(11, __dbResults);
    this.domain = JdbcWritableBridge.readString(12, __dbResults);
    this.homepage_url = JdbcWritableBridge.readString(13, __dbResults);
    this.twitter_username = JdbcWritableBridge.readString(14, __dbResults);
    this.logo_url = JdbcWritableBridge.readString(15, __dbResults);
    this.logo_width = JdbcWritableBridge.readInteger(16, __dbResults);
    this.logo_height = JdbcWritableBridge.readInteger(17, __dbResults);
    this.short_description = JdbcWritableBridge.readString(18, __dbResults);
    this.description = JdbcWritableBridge.readString(19, __dbResults);
    this.overview = JdbcWritableBridge.readString(20, __dbResults);
    this.tag_list = JdbcWritableBridge.readString(21, __dbResults);
    this.country_code = JdbcWritableBridge.readString(22, __dbResults);
    this.state_code = JdbcWritableBridge.readString(23, __dbResults);
    this.city = JdbcWritableBridge.readString(24, __dbResults);
    this.region = JdbcWritableBridge.readString(25, __dbResults);
    this.first_investment_at = JdbcWritableBridge.readDate(26, __dbResults);
    this.last_investment_at = JdbcWritableBridge.readDate(27, __dbResults);
    this.investment_rounds = JdbcWritableBridge.readInteger(28, __dbResults);
    this.invested_companies = JdbcWritableBridge.readInteger(29, __dbResults);
    this.first_funding_at = JdbcWritableBridge.readDate(30, __dbResults);
    this.last_funding_at = JdbcWritableBridge.readDate(31, __dbResults);
    this.funding_rounds = JdbcWritableBridge.readInteger(32, __dbResults);
    this.funding_total_usd = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.first_milestone_at = JdbcWritableBridge.readDate(34, __dbResults);
    this.last_milestone_at = JdbcWritableBridge.readDate(35, __dbResults);
    this.milestones = JdbcWritableBridge.readInteger(36, __dbResults);
    this.relationships = JdbcWritableBridge.readInteger(37, __dbResults);
    this.created_by = JdbcWritableBridge.readString(38, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(39, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(40, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(entity_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(entity_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(parent_id, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(normalized_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(permalink, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category_code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(founded_at, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(closed_at, 11 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(domain, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(homepage_url, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(twitter_username, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(logo_url, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(logo_width, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(logo_height, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(short_description, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(overview, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tag_list, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country_code, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state_code, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(first_investment_at, 26 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last_investment_at, 27 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(investment_rounds, 28 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(invested_companies, 29 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeDate(first_funding_at, 30 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last_funding_at, 31 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(funding_rounds, 32 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(funding_total_usd, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeDate(first_milestone_at, 34 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last_milestone_at, 35 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(milestones, 36 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(relationships, 37 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 39 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 40 + __off, 93, __dbStmt);
    return 40;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(entity_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(entity_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(parent_id, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(normalized_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(permalink, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category_code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(founded_at, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(closed_at, 11 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(domain, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(homepage_url, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(twitter_username, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(logo_url, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(logo_width, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(logo_height, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(short_description, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(overview, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tag_list, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country_code, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state_code, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(region, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(first_investment_at, 26 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last_investment_at, 27 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(investment_rounds, 28 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(invested_companies, 29 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeDate(first_funding_at, 30 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last_funding_at, 31 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(funding_rounds, 32 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(funding_total_usd, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeDate(first_milestone_at, 34 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(last_milestone_at, 35 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(milestones, 36 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(relationships, 37 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 39 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 40 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.entity_type = null;
    } else {
    this.entity_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.entity_id = null;
    } else {
    this.entity_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.parent_id = null;
    } else {
    this.parent_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.normalized_name = null;
    } else {
    this.normalized_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.permalink = null;
    } else {
    this.permalink = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category_code = null;
    } else {
    this.category_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.founded_at = null;
    } else {
    this.founded_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.closed_at = null;
    } else {
    this.closed_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.domain = null;
    } else {
    this.domain = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.homepage_url = null;
    } else {
    this.homepage_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.twitter_username = null;
    } else {
    this.twitter_username = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.logo_url = null;
    } else {
    this.logo_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.logo_width = null;
    } else {
    this.logo_width = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.logo_height = null;
    } else {
    this.logo_height = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.short_description = null;
    } else {
    this.short_description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.overview = null;
    } else {
    this.overview = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tag_list = null;
    } else {
    this.tag_list = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country_code = null;
    } else {
    this.country_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state_code = null;
    } else {
    this.state_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region = null;
    } else {
    this.region = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_investment_at = null;
    } else {
    this.first_investment_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.last_investment_at = null;
    } else {
    this.last_investment_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.investment_rounds = null;
    } else {
    this.investment_rounds = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.invested_companies = null;
    } else {
    this.invested_companies = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.first_funding_at = null;
    } else {
    this.first_funding_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.last_funding_at = null;
    } else {
    this.last_funding_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.funding_rounds = null;
    } else {
    this.funding_rounds = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.funding_total_usd = null;
    } else {
    this.funding_total_usd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_milestone_at = null;
    } else {
    this.first_milestone_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.last_milestone_at = null;
    } else {
    this.last_milestone_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.milestones = null;
    } else {
    this.milestones = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.relationships = null;
    } else {
    this.relationships = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.created_by = null;
    } else {
    this.created_by = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created_at = null;
    } else {
    this.created_at = new Timestamp(__dataIn.readLong());
    this.created_at.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.updated_at = null;
    } else {
    this.updated_at = new Timestamp(__dataIn.readLong());
    this.updated_at.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id);
    }
    if (null == this.entity_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, entity_type);
    }
    if (null == this.entity_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.entity_id);
    }
    if (null == this.parent_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, parent_id);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.normalized_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, normalized_name);
    }
    if (null == this.permalink) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, permalink);
    }
    if (null == this.category_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_code);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.founded_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.founded_at.getTime());
    }
    if (null == this.closed_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.closed_at.getTime());
    }
    if (null == this.domain) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, domain);
    }
    if (null == this.homepage_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, homepage_url);
    }
    if (null == this.twitter_username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, twitter_username);
    }
    if (null == this.logo_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, logo_url);
    }
    if (null == this.logo_width) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.logo_width);
    }
    if (null == this.logo_height) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.logo_height);
    }
    if (null == this.short_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, short_description);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.overview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, overview);
    }
    if (null == this.tag_list) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tag_list);
    }
    if (null == this.country_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_code);
    }
    if (null == this.state_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state_code);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region);
    }
    if (null == this.first_investment_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first_investment_at.getTime());
    }
    if (null == this.last_investment_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_investment_at.getTime());
    }
    if (null == this.investment_rounds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.investment_rounds);
    }
    if (null == this.invested_companies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.invested_companies);
    }
    if (null == this.first_funding_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first_funding_at.getTime());
    }
    if (null == this.last_funding_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_funding_at.getTime());
    }
    if (null == this.funding_rounds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.funding_rounds);
    }
    if (null == this.funding_total_usd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.funding_total_usd, __dataOut);
    }
    if (null == this.first_milestone_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first_milestone_at.getTime());
    }
    if (null == this.last_milestone_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_milestone_at.getTime());
    }
    if (null == this.milestones) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.milestones);
    }
    if (null == this.relationships) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.relationships);
    }
    if (null == this.created_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, created_by);
    }
    if (null == this.created_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_at.getTime());
    __dataOut.writeInt(this.created_at.getNanos());
    }
    if (null == this.updated_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updated_at.getTime());
    __dataOut.writeInt(this.updated_at.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id);
    }
    if (null == this.entity_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, entity_type);
    }
    if (null == this.entity_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.entity_id);
    }
    if (null == this.parent_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, parent_id);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.normalized_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, normalized_name);
    }
    if (null == this.permalink) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, permalink);
    }
    if (null == this.category_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_code);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.founded_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.founded_at.getTime());
    }
    if (null == this.closed_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.closed_at.getTime());
    }
    if (null == this.domain) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, domain);
    }
    if (null == this.homepage_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, homepage_url);
    }
    if (null == this.twitter_username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, twitter_username);
    }
    if (null == this.logo_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, logo_url);
    }
    if (null == this.logo_width) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.logo_width);
    }
    if (null == this.logo_height) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.logo_height);
    }
    if (null == this.short_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, short_description);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.overview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, overview);
    }
    if (null == this.tag_list) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tag_list);
    }
    if (null == this.country_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_code);
    }
    if (null == this.state_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state_code);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region);
    }
    if (null == this.first_investment_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first_investment_at.getTime());
    }
    if (null == this.last_investment_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_investment_at.getTime());
    }
    if (null == this.investment_rounds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.investment_rounds);
    }
    if (null == this.invested_companies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.invested_companies);
    }
    if (null == this.first_funding_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first_funding_at.getTime());
    }
    if (null == this.last_funding_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_funding_at.getTime());
    }
    if (null == this.funding_rounds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.funding_rounds);
    }
    if (null == this.funding_total_usd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.funding_total_usd, __dataOut);
    }
    if (null == this.first_milestone_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.first_milestone_at.getTime());
    }
    if (null == this.last_milestone_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_milestone_at.getTime());
    }
    if (null == this.milestones) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.milestones);
    }
    if (null == this.relationships) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.relationships);
    }
    if (null == this.created_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, created_by);
    }
    if (null == this.created_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_at.getTime());
    __dataOut.writeInt(this.created_at.getNanos());
    }
    if (null == this.updated_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updated_at.getTime());
    __dataOut.writeInt(this.updated_at.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entity_type==null?"null":entity_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entity_id==null?"null":"" + entity_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_id==null?"null":parent_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(normalized_name==null?"null":normalized_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(permalink==null?"null":permalink, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_code==null?"null":category_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(founded_at==null?"null":"" + founded_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(closed_at==null?"null":"" + closed_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(domain==null?"null":domain, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(homepage_url==null?"null":homepage_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(twitter_username==null?"null":twitter_username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(logo_url==null?"null":logo_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(logo_width==null?"null":"" + logo_width, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(logo_height==null?"null":"" + logo_height, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(short_description==null?"null":short_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(overview==null?"null":overview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tag_list==null?"null":tag_list, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_code==null?"null":country_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state_code==null?"null":state_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region==null?"null":region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_investment_at==null?"null":"" + first_investment_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_investment_at==null?"null":"" + last_investment_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(investment_rounds==null?"null":"" + investment_rounds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(invested_companies==null?"null":"" + invested_companies, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_funding_at==null?"null":"" + first_funding_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_funding_at==null?"null":"" + last_funding_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_rounds==null?"null":"" + funding_rounds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_total_usd==null?"null":funding_total_usd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_milestone_at==null?"null":"" + first_milestone_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_milestone_at==null?"null":"" + last_milestone_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(milestones==null?"null":"" + milestones, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(relationships==null?"null":"" + relationships, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_by==null?"null":created_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_at==null?"null":"" + created_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_at==null?"null":"" + updated_at, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entity_type==null?"null":entity_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entity_id==null?"null":"" + entity_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_id==null?"null":parent_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(normalized_name==null?"null":normalized_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(permalink==null?"null":permalink, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_code==null?"null":category_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(founded_at==null?"null":"" + founded_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(closed_at==null?"null":"" + closed_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(domain==null?"null":domain, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(homepage_url==null?"null":homepage_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(twitter_username==null?"null":twitter_username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(logo_url==null?"null":logo_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(logo_width==null?"null":"" + logo_width, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(logo_height==null?"null":"" + logo_height, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(short_description==null?"null":short_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(overview==null?"null":overview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tag_list==null?"null":tag_list, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_code==null?"null":country_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state_code==null?"null":state_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region==null?"null":region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_investment_at==null?"null":"" + first_investment_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_investment_at==null?"null":"" + last_investment_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(investment_rounds==null?"null":"" + investment_rounds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(invested_companies==null?"null":"" + invested_companies, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_funding_at==null?"null":"" + first_funding_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_funding_at==null?"null":"" + last_funding_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_rounds==null?"null":"" + funding_rounds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_total_usd==null?"null":funding_total_usd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_milestone_at==null?"null":"" + first_milestone_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_milestone_at==null?"null":"" + last_milestone_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(milestones==null?"null":"" + milestones, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(relationships==null?"null":"" + relationships, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_by==null?"null":created_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_at==null?"null":"" + created_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_at==null?"null":"" + updated_at, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.entity_type = null; } else {
      this.entity_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.entity_id = null; } else {
      this.entity_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.parent_id = null; } else {
      this.parent_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.normalized_name = null; } else {
      this.normalized_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.permalink = null; } else {
      this.permalink = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_code = null; } else {
      this.category_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.founded_at = null; } else {
      this.founded_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.closed_at = null; } else {
      this.closed_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.domain = null; } else {
      this.domain = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.homepage_url = null; } else {
      this.homepage_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.twitter_username = null; } else {
      this.twitter_username = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.logo_url = null; } else {
      this.logo_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.logo_width = null; } else {
      this.logo_width = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.logo_height = null; } else {
      this.logo_height = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.short_description = null; } else {
      this.short_description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.overview = null; } else {
      this.overview = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.tag_list = null; } else {
      this.tag_list = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country_code = null; } else {
      this.country_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.state_code = null; } else {
      this.state_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region = null; } else {
      this.region = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_investment_at = null; } else {
      this.first_investment_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_investment_at = null; } else {
      this.last_investment_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.investment_rounds = null; } else {
      this.investment_rounds = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.invested_companies = null; } else {
      this.invested_companies = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_funding_at = null; } else {
      this.first_funding_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_funding_at = null; } else {
      this.last_funding_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funding_rounds = null; } else {
      this.funding_rounds = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funding_total_usd = null; } else {
      this.funding_total_usd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_milestone_at = null; } else {
      this.first_milestone_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_milestone_at = null; } else {
      this.last_milestone_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.milestones = null; } else {
      this.milestones = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.relationships = null; } else {
      this.relationships = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.created_by = null; } else {
      this.created_by = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_at = null; } else {
      this.created_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updated_at = null; } else {
      this.updated_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.entity_type = null; } else {
      this.entity_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.entity_id = null; } else {
      this.entity_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.parent_id = null; } else {
      this.parent_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.normalized_name = null; } else {
      this.normalized_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.permalink = null; } else {
      this.permalink = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_code = null; } else {
      this.category_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.founded_at = null; } else {
      this.founded_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.closed_at = null; } else {
      this.closed_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.domain = null; } else {
      this.domain = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.homepage_url = null; } else {
      this.homepage_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.twitter_username = null; } else {
      this.twitter_username = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.logo_url = null; } else {
      this.logo_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.logo_width = null; } else {
      this.logo_width = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.logo_height = null; } else {
      this.logo_height = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.short_description = null; } else {
      this.short_description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.overview = null; } else {
      this.overview = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.tag_list = null; } else {
      this.tag_list = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country_code = null; } else {
      this.country_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.state_code = null; } else {
      this.state_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.region = null; } else {
      this.region = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_investment_at = null; } else {
      this.first_investment_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_investment_at = null; } else {
      this.last_investment_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.investment_rounds = null; } else {
      this.investment_rounds = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.invested_companies = null; } else {
      this.invested_companies = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_funding_at = null; } else {
      this.first_funding_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_funding_at = null; } else {
      this.last_funding_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funding_rounds = null; } else {
      this.funding_rounds = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funding_total_usd = null; } else {
      this.funding_total_usd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_milestone_at = null; } else {
      this.first_milestone_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_milestone_at = null; } else {
      this.last_milestone_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.milestones = null; } else {
      this.milestones = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.relationships = null; } else {
      this.relationships = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.created_by = null; } else {
      this.created_by = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_at = null; } else {
      this.created_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updated_at = null; } else {
      this.updated_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    objects o = (objects) super.clone();
    o.founded_at = (o.founded_at != null) ? (java.sql.Date) o.founded_at.clone() : null;
    o.closed_at = (o.closed_at != null) ? (java.sql.Date) o.closed_at.clone() : null;
    o.first_investment_at = (o.first_investment_at != null) ? (java.sql.Date) o.first_investment_at.clone() : null;
    o.last_investment_at = (o.last_investment_at != null) ? (java.sql.Date) o.last_investment_at.clone() : null;
    o.first_funding_at = (o.first_funding_at != null) ? (java.sql.Date) o.first_funding_at.clone() : null;
    o.last_funding_at = (o.last_funding_at != null) ? (java.sql.Date) o.last_funding_at.clone() : null;
    o.first_milestone_at = (o.first_milestone_at != null) ? (java.sql.Date) o.first_milestone_at.clone() : null;
    o.last_milestone_at = (o.last_milestone_at != null) ? (java.sql.Date) o.last_milestone_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    return o;
  }

  public void clone0(objects o) throws CloneNotSupportedException {
    o.founded_at = (o.founded_at != null) ? (java.sql.Date) o.founded_at.clone() : null;
    o.closed_at = (o.closed_at != null) ? (java.sql.Date) o.closed_at.clone() : null;
    o.first_investment_at = (o.first_investment_at != null) ? (java.sql.Date) o.first_investment_at.clone() : null;
    o.last_investment_at = (o.last_investment_at != null) ? (java.sql.Date) o.last_investment_at.clone() : null;
    o.first_funding_at = (o.first_funding_at != null) ? (java.sql.Date) o.first_funding_at.clone() : null;
    o.last_funding_at = (o.last_funding_at != null) ? (java.sql.Date) o.last_funding_at.clone() : null;
    o.first_milestone_at = (o.first_milestone_at != null) ? (java.sql.Date) o.first_milestone_at.clone() : null;
    o.last_milestone_at = (o.last_milestone_at != null) ? (java.sql.Date) o.last_milestone_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("entity_type", this.entity_type);
    __sqoop$field_map.put("entity_id", this.entity_id);
    __sqoop$field_map.put("parent_id", this.parent_id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("normalized_name", this.normalized_name);
    __sqoop$field_map.put("permalink", this.permalink);
    __sqoop$field_map.put("category_code", this.category_code);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("founded_at", this.founded_at);
    __sqoop$field_map.put("closed_at", this.closed_at);
    __sqoop$field_map.put("domain", this.domain);
    __sqoop$field_map.put("homepage_url", this.homepage_url);
    __sqoop$field_map.put("twitter_username", this.twitter_username);
    __sqoop$field_map.put("logo_url", this.logo_url);
    __sqoop$field_map.put("logo_width", this.logo_width);
    __sqoop$field_map.put("logo_height", this.logo_height);
    __sqoop$field_map.put("short_description", this.short_description);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("overview", this.overview);
    __sqoop$field_map.put("tag_list", this.tag_list);
    __sqoop$field_map.put("country_code", this.country_code);
    __sqoop$field_map.put("state_code", this.state_code);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("region", this.region);
    __sqoop$field_map.put("first_investment_at", this.first_investment_at);
    __sqoop$field_map.put("last_investment_at", this.last_investment_at);
    __sqoop$field_map.put("investment_rounds", this.investment_rounds);
    __sqoop$field_map.put("invested_companies", this.invested_companies);
    __sqoop$field_map.put("first_funding_at", this.first_funding_at);
    __sqoop$field_map.put("last_funding_at", this.last_funding_at);
    __sqoop$field_map.put("funding_rounds", this.funding_rounds);
    __sqoop$field_map.put("funding_total_usd", this.funding_total_usd);
    __sqoop$field_map.put("first_milestone_at", this.first_milestone_at);
    __sqoop$field_map.put("last_milestone_at", this.last_milestone_at);
    __sqoop$field_map.put("milestones", this.milestones);
    __sqoop$field_map.put("relationships", this.relationships);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("entity_type", this.entity_type);
    __sqoop$field_map.put("entity_id", this.entity_id);
    __sqoop$field_map.put("parent_id", this.parent_id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("normalized_name", this.normalized_name);
    __sqoop$field_map.put("permalink", this.permalink);
    __sqoop$field_map.put("category_code", this.category_code);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("founded_at", this.founded_at);
    __sqoop$field_map.put("closed_at", this.closed_at);
    __sqoop$field_map.put("domain", this.domain);
    __sqoop$field_map.put("homepage_url", this.homepage_url);
    __sqoop$field_map.put("twitter_username", this.twitter_username);
    __sqoop$field_map.put("logo_url", this.logo_url);
    __sqoop$field_map.put("logo_width", this.logo_width);
    __sqoop$field_map.put("logo_height", this.logo_height);
    __sqoop$field_map.put("short_description", this.short_description);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("overview", this.overview);
    __sqoop$field_map.put("tag_list", this.tag_list);
    __sqoop$field_map.put("country_code", this.country_code);
    __sqoop$field_map.put("state_code", this.state_code);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("region", this.region);
    __sqoop$field_map.put("first_investment_at", this.first_investment_at);
    __sqoop$field_map.put("last_investment_at", this.last_investment_at);
    __sqoop$field_map.put("investment_rounds", this.investment_rounds);
    __sqoop$field_map.put("invested_companies", this.invested_companies);
    __sqoop$field_map.put("first_funding_at", this.first_funding_at);
    __sqoop$field_map.put("last_funding_at", this.last_funding_at);
    __sqoop$field_map.put("funding_rounds", this.funding_rounds);
    __sqoop$field_map.put("funding_total_usd", this.funding_total_usd);
    __sqoop$field_map.put("first_milestone_at", this.first_milestone_at);
    __sqoop$field_map.put("last_milestone_at", this.last_milestone_at);
    __sqoop$field_map.put("milestones", this.milestones);
    __sqoop$field_map.put("relationships", this.relationships);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
