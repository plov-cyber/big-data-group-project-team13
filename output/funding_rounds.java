// ORM class for table 'funding_rounds'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun May 12 11:45:16 MSK 2024
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

public class funding_rounds extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.id = (Integer)value;
      }
    });
    setters.put("funding_round_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.funding_round_id = (Long)value;
      }
    });
    setters.put("object_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.object_id = (String)value;
      }
    });
    setters.put("funded_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.funded_at = (java.sql.Date)value;
      }
    });
    setters.put("funding_round_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.funding_round_type = (String)value;
      }
    });
    setters.put("funding_round_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.funding_round_code = (String)value;
      }
    });
    setters.put("raised_amount_usd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.raised_amount_usd = (java.math.BigDecimal)value;
      }
    });
    setters.put("raised_amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.raised_amount = (java.math.BigDecimal)value;
      }
    });
    setters.put("raised_currency_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.raised_currency_code = (String)value;
      }
    });
    setters.put("pre_money_valuation_usd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.pre_money_valuation_usd = (java.math.BigDecimal)value;
      }
    });
    setters.put("pre_money_valuation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.pre_money_valuation = (java.math.BigDecimal)value;
      }
    });
    setters.put("pre_money_currency_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.pre_money_currency_code = (String)value;
      }
    });
    setters.put("post_money_valuation_usd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.post_money_valuation_usd = (java.math.BigDecimal)value;
      }
    });
    setters.put("post_money_valuation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.post_money_valuation = (java.math.BigDecimal)value;
      }
    });
    setters.put("post_money_currency_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.post_money_currency_code = (String)value;
      }
    });
    setters.put("participants", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.participants = (Integer)value;
      }
    });
    setters.put("is_first_round", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.is_first_round = (Integer)value;
      }
    });
    setters.put("is_last_round", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.is_last_round = (Integer)value;
      }
    });
    setters.put("source_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.source_url = (String)value;
      }
    });
    setters.put("source_description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.source_description = (String)value;
      }
    });
    setters.put("created_by", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.created_by = (String)value;
      }
    });
    setters.put("created_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.created_at = (java.sql.Timestamp)value;
      }
    });
    setters.put("updated_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        funding_rounds.this.updated_at = (java.sql.Timestamp)value;
      }
    });
  }
  public funding_rounds() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public funding_rounds with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Long funding_round_id;
  public Long get_funding_round_id() {
    return funding_round_id;
  }
  public void set_funding_round_id(Long funding_round_id) {
    this.funding_round_id = funding_round_id;
  }
  public funding_rounds with_funding_round_id(Long funding_round_id) {
    this.funding_round_id = funding_round_id;
    return this;
  }
  private String object_id;
  public String get_object_id() {
    return object_id;
  }
  public void set_object_id(String object_id) {
    this.object_id = object_id;
  }
  public funding_rounds with_object_id(String object_id) {
    this.object_id = object_id;
    return this;
  }
  private java.sql.Date funded_at;
  public java.sql.Date get_funded_at() {
    return funded_at;
  }
  public void set_funded_at(java.sql.Date funded_at) {
    this.funded_at = funded_at;
  }
  public funding_rounds with_funded_at(java.sql.Date funded_at) {
    this.funded_at = funded_at;
    return this;
  }
  private String funding_round_type;
  public String get_funding_round_type() {
    return funding_round_type;
  }
  public void set_funding_round_type(String funding_round_type) {
    this.funding_round_type = funding_round_type;
  }
  public funding_rounds with_funding_round_type(String funding_round_type) {
    this.funding_round_type = funding_round_type;
    return this;
  }
  private String funding_round_code;
  public String get_funding_round_code() {
    return funding_round_code;
  }
  public void set_funding_round_code(String funding_round_code) {
    this.funding_round_code = funding_round_code;
  }
  public funding_rounds with_funding_round_code(String funding_round_code) {
    this.funding_round_code = funding_round_code;
    return this;
  }
  private java.math.BigDecimal raised_amount_usd;
  public java.math.BigDecimal get_raised_amount_usd() {
    return raised_amount_usd;
  }
  public void set_raised_amount_usd(java.math.BigDecimal raised_amount_usd) {
    this.raised_amount_usd = raised_amount_usd;
  }
  public funding_rounds with_raised_amount_usd(java.math.BigDecimal raised_amount_usd) {
    this.raised_amount_usd = raised_amount_usd;
    return this;
  }
  private java.math.BigDecimal raised_amount;
  public java.math.BigDecimal get_raised_amount() {
    return raised_amount;
  }
  public void set_raised_amount(java.math.BigDecimal raised_amount) {
    this.raised_amount = raised_amount;
  }
  public funding_rounds with_raised_amount(java.math.BigDecimal raised_amount) {
    this.raised_amount = raised_amount;
    return this;
  }
  private String raised_currency_code;
  public String get_raised_currency_code() {
    return raised_currency_code;
  }
  public void set_raised_currency_code(String raised_currency_code) {
    this.raised_currency_code = raised_currency_code;
  }
  public funding_rounds with_raised_currency_code(String raised_currency_code) {
    this.raised_currency_code = raised_currency_code;
    return this;
  }
  private java.math.BigDecimal pre_money_valuation_usd;
  public java.math.BigDecimal get_pre_money_valuation_usd() {
    return pre_money_valuation_usd;
  }
  public void set_pre_money_valuation_usd(java.math.BigDecimal pre_money_valuation_usd) {
    this.pre_money_valuation_usd = pre_money_valuation_usd;
  }
  public funding_rounds with_pre_money_valuation_usd(java.math.BigDecimal pre_money_valuation_usd) {
    this.pre_money_valuation_usd = pre_money_valuation_usd;
    return this;
  }
  private java.math.BigDecimal pre_money_valuation;
  public java.math.BigDecimal get_pre_money_valuation() {
    return pre_money_valuation;
  }
  public void set_pre_money_valuation(java.math.BigDecimal pre_money_valuation) {
    this.pre_money_valuation = pre_money_valuation;
  }
  public funding_rounds with_pre_money_valuation(java.math.BigDecimal pre_money_valuation) {
    this.pre_money_valuation = pre_money_valuation;
    return this;
  }
  private String pre_money_currency_code;
  public String get_pre_money_currency_code() {
    return pre_money_currency_code;
  }
  public void set_pre_money_currency_code(String pre_money_currency_code) {
    this.pre_money_currency_code = pre_money_currency_code;
  }
  public funding_rounds with_pre_money_currency_code(String pre_money_currency_code) {
    this.pre_money_currency_code = pre_money_currency_code;
    return this;
  }
  private java.math.BigDecimal post_money_valuation_usd;
  public java.math.BigDecimal get_post_money_valuation_usd() {
    return post_money_valuation_usd;
  }
  public void set_post_money_valuation_usd(java.math.BigDecimal post_money_valuation_usd) {
    this.post_money_valuation_usd = post_money_valuation_usd;
  }
  public funding_rounds with_post_money_valuation_usd(java.math.BigDecimal post_money_valuation_usd) {
    this.post_money_valuation_usd = post_money_valuation_usd;
    return this;
  }
  private java.math.BigDecimal post_money_valuation;
  public java.math.BigDecimal get_post_money_valuation() {
    return post_money_valuation;
  }
  public void set_post_money_valuation(java.math.BigDecimal post_money_valuation) {
    this.post_money_valuation = post_money_valuation;
  }
  public funding_rounds with_post_money_valuation(java.math.BigDecimal post_money_valuation) {
    this.post_money_valuation = post_money_valuation;
    return this;
  }
  private String post_money_currency_code;
  public String get_post_money_currency_code() {
    return post_money_currency_code;
  }
  public void set_post_money_currency_code(String post_money_currency_code) {
    this.post_money_currency_code = post_money_currency_code;
  }
  public funding_rounds with_post_money_currency_code(String post_money_currency_code) {
    this.post_money_currency_code = post_money_currency_code;
    return this;
  }
  private Integer participants;
  public Integer get_participants() {
    return participants;
  }
  public void set_participants(Integer participants) {
    this.participants = participants;
  }
  public funding_rounds with_participants(Integer participants) {
    this.participants = participants;
    return this;
  }
  private Integer is_first_round;
  public Integer get_is_first_round() {
    return is_first_round;
  }
  public void set_is_first_round(Integer is_first_round) {
    this.is_first_round = is_first_round;
  }
  public funding_rounds with_is_first_round(Integer is_first_round) {
    this.is_first_round = is_first_round;
    return this;
  }
  private Integer is_last_round;
  public Integer get_is_last_round() {
    return is_last_round;
  }
  public void set_is_last_round(Integer is_last_round) {
    this.is_last_round = is_last_round;
  }
  public funding_rounds with_is_last_round(Integer is_last_round) {
    this.is_last_round = is_last_round;
    return this;
  }
  private String source_url;
  public String get_source_url() {
    return source_url;
  }
  public void set_source_url(String source_url) {
    this.source_url = source_url;
  }
  public funding_rounds with_source_url(String source_url) {
    this.source_url = source_url;
    return this;
  }
  private String source_description;
  public String get_source_description() {
    return source_description;
  }
  public void set_source_description(String source_description) {
    this.source_description = source_description;
  }
  public funding_rounds with_source_description(String source_description) {
    this.source_description = source_description;
    return this;
  }
  private String created_by;
  public String get_created_by() {
    return created_by;
  }
  public void set_created_by(String created_by) {
    this.created_by = created_by;
  }
  public funding_rounds with_created_by(String created_by) {
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
  public funding_rounds with_created_at(java.sql.Timestamp created_at) {
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
  public funding_rounds with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof funding_rounds)) {
      return false;
    }
    funding_rounds that = (funding_rounds) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.funding_round_id == null ? that.funding_round_id == null : this.funding_round_id.equals(that.funding_round_id));
    equal = equal && (this.object_id == null ? that.object_id == null : this.object_id.equals(that.object_id));
    equal = equal && (this.funded_at == null ? that.funded_at == null : this.funded_at.equals(that.funded_at));
    equal = equal && (this.funding_round_type == null ? that.funding_round_type == null : this.funding_round_type.equals(that.funding_round_type));
    equal = equal && (this.funding_round_code == null ? that.funding_round_code == null : this.funding_round_code.equals(that.funding_round_code));
    equal = equal && (this.raised_amount_usd == null ? that.raised_amount_usd == null : this.raised_amount_usd.equals(that.raised_amount_usd));
    equal = equal && (this.raised_amount == null ? that.raised_amount == null : this.raised_amount.equals(that.raised_amount));
    equal = equal && (this.raised_currency_code == null ? that.raised_currency_code == null : this.raised_currency_code.equals(that.raised_currency_code));
    equal = equal && (this.pre_money_valuation_usd == null ? that.pre_money_valuation_usd == null : this.pre_money_valuation_usd.equals(that.pre_money_valuation_usd));
    equal = equal && (this.pre_money_valuation == null ? that.pre_money_valuation == null : this.pre_money_valuation.equals(that.pre_money_valuation));
    equal = equal && (this.pre_money_currency_code == null ? that.pre_money_currency_code == null : this.pre_money_currency_code.equals(that.pre_money_currency_code));
    equal = equal && (this.post_money_valuation_usd == null ? that.post_money_valuation_usd == null : this.post_money_valuation_usd.equals(that.post_money_valuation_usd));
    equal = equal && (this.post_money_valuation == null ? that.post_money_valuation == null : this.post_money_valuation.equals(that.post_money_valuation));
    equal = equal && (this.post_money_currency_code == null ? that.post_money_currency_code == null : this.post_money_currency_code.equals(that.post_money_currency_code));
    equal = equal && (this.participants == null ? that.participants == null : this.participants.equals(that.participants));
    equal = equal && (this.is_first_round == null ? that.is_first_round == null : this.is_first_round.equals(that.is_first_round));
    equal = equal && (this.is_last_round == null ? that.is_last_round == null : this.is_last_round.equals(that.is_last_round));
    equal = equal && (this.source_url == null ? that.source_url == null : this.source_url.equals(that.source_url));
    equal = equal && (this.source_description == null ? that.source_description == null : this.source_description.equals(that.source_description));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof funding_rounds)) {
      return false;
    }
    funding_rounds that = (funding_rounds) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.funding_round_id == null ? that.funding_round_id == null : this.funding_round_id.equals(that.funding_round_id));
    equal = equal && (this.object_id == null ? that.object_id == null : this.object_id.equals(that.object_id));
    equal = equal && (this.funded_at == null ? that.funded_at == null : this.funded_at.equals(that.funded_at));
    equal = equal && (this.funding_round_type == null ? that.funding_round_type == null : this.funding_round_type.equals(that.funding_round_type));
    equal = equal && (this.funding_round_code == null ? that.funding_round_code == null : this.funding_round_code.equals(that.funding_round_code));
    equal = equal && (this.raised_amount_usd == null ? that.raised_amount_usd == null : this.raised_amount_usd.equals(that.raised_amount_usd));
    equal = equal && (this.raised_amount == null ? that.raised_amount == null : this.raised_amount.equals(that.raised_amount));
    equal = equal && (this.raised_currency_code == null ? that.raised_currency_code == null : this.raised_currency_code.equals(that.raised_currency_code));
    equal = equal && (this.pre_money_valuation_usd == null ? that.pre_money_valuation_usd == null : this.pre_money_valuation_usd.equals(that.pre_money_valuation_usd));
    equal = equal && (this.pre_money_valuation == null ? that.pre_money_valuation == null : this.pre_money_valuation.equals(that.pre_money_valuation));
    equal = equal && (this.pre_money_currency_code == null ? that.pre_money_currency_code == null : this.pre_money_currency_code.equals(that.pre_money_currency_code));
    equal = equal && (this.post_money_valuation_usd == null ? that.post_money_valuation_usd == null : this.post_money_valuation_usd.equals(that.post_money_valuation_usd));
    equal = equal && (this.post_money_valuation == null ? that.post_money_valuation == null : this.post_money_valuation.equals(that.post_money_valuation));
    equal = equal && (this.post_money_currency_code == null ? that.post_money_currency_code == null : this.post_money_currency_code.equals(that.post_money_currency_code));
    equal = equal && (this.participants == null ? that.participants == null : this.participants.equals(that.participants));
    equal = equal && (this.is_first_round == null ? that.is_first_round == null : this.is_first_round.equals(that.is_first_round));
    equal = equal && (this.is_last_round == null ? that.is_last_round == null : this.is_last_round.equals(that.is_last_round));
    equal = equal && (this.source_url == null ? that.source_url == null : this.source_url.equals(that.source_url));
    equal = equal && (this.source_description == null ? that.source_description == null : this.source_description.equals(that.source_description));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.funding_round_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.object_id = JdbcWritableBridge.readString(3, __dbResults);
    this.funded_at = JdbcWritableBridge.readDate(4, __dbResults);
    this.funding_round_type = JdbcWritableBridge.readString(5, __dbResults);
    this.funding_round_code = JdbcWritableBridge.readString(6, __dbResults);
    this.raised_amount_usd = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.raised_amount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.raised_currency_code = JdbcWritableBridge.readString(9, __dbResults);
    this.pre_money_valuation_usd = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.pre_money_valuation = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.pre_money_currency_code = JdbcWritableBridge.readString(12, __dbResults);
    this.post_money_valuation_usd = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.post_money_valuation = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.post_money_currency_code = JdbcWritableBridge.readString(15, __dbResults);
    this.participants = JdbcWritableBridge.readInteger(16, __dbResults);
    this.is_first_round = JdbcWritableBridge.readInteger(17, __dbResults);
    this.is_last_round = JdbcWritableBridge.readInteger(18, __dbResults);
    this.source_url = JdbcWritableBridge.readString(19, __dbResults);
    this.source_description = JdbcWritableBridge.readString(20, __dbResults);
    this.created_by = JdbcWritableBridge.readString(21, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.funding_round_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.object_id = JdbcWritableBridge.readString(3, __dbResults);
    this.funded_at = JdbcWritableBridge.readDate(4, __dbResults);
    this.funding_round_type = JdbcWritableBridge.readString(5, __dbResults);
    this.funding_round_code = JdbcWritableBridge.readString(6, __dbResults);
    this.raised_amount_usd = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.raised_amount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.raised_currency_code = JdbcWritableBridge.readString(9, __dbResults);
    this.pre_money_valuation_usd = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.pre_money_valuation = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.pre_money_currency_code = JdbcWritableBridge.readString(12, __dbResults);
    this.post_money_valuation_usd = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.post_money_valuation = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.post_money_currency_code = JdbcWritableBridge.readString(15, __dbResults);
    this.participants = JdbcWritableBridge.readInteger(16, __dbResults);
    this.is_first_round = JdbcWritableBridge.readInteger(17, __dbResults);
    this.is_last_round = JdbcWritableBridge.readInteger(18, __dbResults);
    this.source_url = JdbcWritableBridge.readString(19, __dbResults);
    this.source_description = JdbcWritableBridge.readString(20, __dbResults);
    this.created_by = JdbcWritableBridge.readString(21, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(23, __dbResults);
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
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(funding_round_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(object_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(funded_at, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(funding_round_type, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(funding_round_code, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(raised_amount_usd, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(raised_amount, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(raised_currency_code, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pre_money_valuation_usd, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pre_money_valuation, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(pre_money_currency_code, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(post_money_valuation_usd, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(post_money_valuation, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(post_money_currency_code, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(participants, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(is_first_round, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(is_last_round, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(source_url, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_description, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 23 + __off, 93, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(funding_round_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(object_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(funded_at, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(funding_round_type, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(funding_round_code, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(raised_amount_usd, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(raised_amount, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(raised_currency_code, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pre_money_valuation_usd, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(pre_money_valuation, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(pre_money_currency_code, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(post_money_valuation_usd, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(post_money_valuation, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(post_money_currency_code, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(participants, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(is_first_round, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(is_last_round, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(source_url, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_description, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 23 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.funding_round_id = null;
    } else {
    this.funding_round_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.object_id = null;
    } else {
    this.object_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.funded_at = null;
    } else {
    this.funded_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.funding_round_type = null;
    } else {
    this.funding_round_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.funding_round_code = null;
    } else {
    this.funding_round_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.raised_amount_usd = null;
    } else {
    this.raised_amount_usd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.raised_amount = null;
    } else {
    this.raised_amount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.raised_currency_code = null;
    } else {
    this.raised_currency_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pre_money_valuation_usd = null;
    } else {
    this.pre_money_valuation_usd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pre_money_valuation = null;
    } else {
    this.pre_money_valuation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pre_money_currency_code = null;
    } else {
    this.pre_money_currency_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.post_money_valuation_usd = null;
    } else {
    this.post_money_valuation_usd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.post_money_valuation = null;
    } else {
    this.post_money_valuation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.post_money_currency_code = null;
    } else {
    this.post_money_currency_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.participants = null;
    } else {
    this.participants = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.is_first_round = null;
    } else {
    this.is_first_round = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.is_last_round = null;
    } else {
    this.is_last_round = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.source_url = null;
    } else {
    this.source_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.source_description = null;
    } else {
    this.source_description = Text.readString(__dataIn);
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
    __dataOut.writeInt(this.id);
    }
    if (null == this.funding_round_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.funding_round_id);
    }
    if (null == this.object_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, object_id);
    }
    if (null == this.funded_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.funded_at.getTime());
    }
    if (null == this.funding_round_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, funding_round_type);
    }
    if (null == this.funding_round_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, funding_round_code);
    }
    if (null == this.raised_amount_usd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.raised_amount_usd, __dataOut);
    }
    if (null == this.raised_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.raised_amount, __dataOut);
    }
    if (null == this.raised_currency_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, raised_currency_code);
    }
    if (null == this.pre_money_valuation_usd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pre_money_valuation_usd, __dataOut);
    }
    if (null == this.pre_money_valuation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pre_money_valuation, __dataOut);
    }
    if (null == this.pre_money_currency_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pre_money_currency_code);
    }
    if (null == this.post_money_valuation_usd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.post_money_valuation_usd, __dataOut);
    }
    if (null == this.post_money_valuation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.post_money_valuation, __dataOut);
    }
    if (null == this.post_money_currency_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, post_money_currency_code);
    }
    if (null == this.participants) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.participants);
    }
    if (null == this.is_first_round) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_first_round);
    }
    if (null == this.is_last_round) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_last_round);
    }
    if (null == this.source_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, source_url);
    }
    if (null == this.source_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, source_description);
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
    __dataOut.writeInt(this.id);
    }
    if (null == this.funding_round_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.funding_round_id);
    }
    if (null == this.object_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, object_id);
    }
    if (null == this.funded_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.funded_at.getTime());
    }
    if (null == this.funding_round_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, funding_round_type);
    }
    if (null == this.funding_round_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, funding_round_code);
    }
    if (null == this.raised_amount_usd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.raised_amount_usd, __dataOut);
    }
    if (null == this.raised_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.raised_amount, __dataOut);
    }
    if (null == this.raised_currency_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, raised_currency_code);
    }
    if (null == this.pre_money_valuation_usd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pre_money_valuation_usd, __dataOut);
    }
    if (null == this.pre_money_valuation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.pre_money_valuation, __dataOut);
    }
    if (null == this.pre_money_currency_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pre_money_currency_code);
    }
    if (null == this.post_money_valuation_usd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.post_money_valuation_usd, __dataOut);
    }
    if (null == this.post_money_valuation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.post_money_valuation, __dataOut);
    }
    if (null == this.post_money_currency_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, post_money_currency_code);
    }
    if (null == this.participants) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.participants);
    }
    if (null == this.is_first_round) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_first_round);
    }
    if (null == this.is_last_round) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.is_last_round);
    }
    if (null == this.source_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, source_url);
    }
    if (null == this.source_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, source_description);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_round_id==null?"null":"" + funding_round_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(object_id==null?"null":object_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funded_at==null?"null":"" + funded_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_round_type==null?"null":funding_round_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_round_code==null?"null":funding_round_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_amount_usd==null?"null":raised_amount_usd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_amount==null?"null":raised_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_currency_code==null?"null":raised_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_money_valuation_usd==null?"null":pre_money_valuation_usd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_money_valuation==null?"null":pre_money_valuation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_money_currency_code==null?"null":pre_money_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(post_money_valuation_usd==null?"null":post_money_valuation_usd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(post_money_valuation==null?"null":post_money_valuation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(post_money_currency_code==null?"null":post_money_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(participants==null?"null":"" + participants, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_first_round==null?"null":"" + is_first_round, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_last_round==null?"null":"" + is_last_round, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_url==null?"null":source_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_description==null?"null":source_description, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_round_id==null?"null":"" + funding_round_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(object_id==null?"null":object_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funded_at==null?"null":"" + funded_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_round_type==null?"null":funding_round_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funding_round_code==null?"null":funding_round_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_amount_usd==null?"null":raised_amount_usd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_amount==null?"null":raised_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_currency_code==null?"null":raised_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_money_valuation_usd==null?"null":pre_money_valuation_usd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_money_valuation==null?"null":pre_money_valuation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pre_money_currency_code==null?"null":pre_money_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(post_money_valuation_usd==null?"null":post_money_valuation_usd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(post_money_valuation==null?"null":post_money_valuation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(post_money_currency_code==null?"null":post_money_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(participants==null?"null":"" + participants, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_first_round==null?"null":"" + is_first_round, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_last_round==null?"null":"" + is_last_round, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_url==null?"null":source_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_description==null?"null":source_description, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funding_round_id = null; } else {
      this.funding_round_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.object_id = null; } else {
      this.object_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funded_at = null; } else {
      this.funded_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.funding_round_type = null; } else {
      this.funding_round_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.funding_round_code = null; } else {
      this.funding_round_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.raised_amount_usd = null; } else {
      this.raised_amount_usd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.raised_amount = null; } else {
      this.raised_amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.raised_currency_code = null; } else {
      this.raised_currency_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_money_valuation_usd = null; } else {
      this.pre_money_valuation_usd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_money_valuation = null; } else {
      this.pre_money_valuation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pre_money_currency_code = null; } else {
      this.pre_money_currency_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.post_money_valuation_usd = null; } else {
      this.post_money_valuation_usd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.post_money_valuation = null; } else {
      this.post_money_valuation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.post_money_currency_code = null; } else {
      this.post_money_currency_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.participants = null; } else {
      this.participants = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_first_round = null; } else {
      this.is_first_round = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_last_round = null; } else {
      this.is_last_round = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.source_url = null; } else {
      this.source_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.source_description = null; } else {
      this.source_description = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funding_round_id = null; } else {
      this.funding_round_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.object_id = null; } else {
      this.object_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funded_at = null; } else {
      this.funded_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.funding_round_type = null; } else {
      this.funding_round_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.funding_round_code = null; } else {
      this.funding_round_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.raised_amount_usd = null; } else {
      this.raised_amount_usd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.raised_amount = null; } else {
      this.raised_amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.raised_currency_code = null; } else {
      this.raised_currency_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_money_valuation_usd = null; } else {
      this.pre_money_valuation_usd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pre_money_valuation = null; } else {
      this.pre_money_valuation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pre_money_currency_code = null; } else {
      this.pre_money_currency_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.post_money_valuation_usd = null; } else {
      this.post_money_valuation_usd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.post_money_valuation = null; } else {
      this.post_money_valuation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.post_money_currency_code = null; } else {
      this.post_money_currency_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.participants = null; } else {
      this.participants = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_first_round = null; } else {
      this.is_first_round = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_last_round = null; } else {
      this.is_last_round = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.source_url = null; } else {
      this.source_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.source_description = null; } else {
      this.source_description = __cur_str;
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
    funding_rounds o = (funding_rounds) super.clone();
    o.funded_at = (o.funded_at != null) ? (java.sql.Date) o.funded_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    return o;
  }

  public void clone0(funding_rounds o) throws CloneNotSupportedException {
    o.funded_at = (o.funded_at != null) ? (java.sql.Date) o.funded_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("funding_round_id", this.funding_round_id);
    __sqoop$field_map.put("object_id", this.object_id);
    __sqoop$field_map.put("funded_at", this.funded_at);
    __sqoop$field_map.put("funding_round_type", this.funding_round_type);
    __sqoop$field_map.put("funding_round_code", this.funding_round_code);
    __sqoop$field_map.put("raised_amount_usd", this.raised_amount_usd);
    __sqoop$field_map.put("raised_amount", this.raised_amount);
    __sqoop$field_map.put("raised_currency_code", this.raised_currency_code);
    __sqoop$field_map.put("pre_money_valuation_usd", this.pre_money_valuation_usd);
    __sqoop$field_map.put("pre_money_valuation", this.pre_money_valuation);
    __sqoop$field_map.put("pre_money_currency_code", this.pre_money_currency_code);
    __sqoop$field_map.put("post_money_valuation_usd", this.post_money_valuation_usd);
    __sqoop$field_map.put("post_money_valuation", this.post_money_valuation);
    __sqoop$field_map.put("post_money_currency_code", this.post_money_currency_code);
    __sqoop$field_map.put("participants", this.participants);
    __sqoop$field_map.put("is_first_round", this.is_first_round);
    __sqoop$field_map.put("is_last_round", this.is_last_round);
    __sqoop$field_map.put("source_url", this.source_url);
    __sqoop$field_map.put("source_description", this.source_description);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("funding_round_id", this.funding_round_id);
    __sqoop$field_map.put("object_id", this.object_id);
    __sqoop$field_map.put("funded_at", this.funded_at);
    __sqoop$field_map.put("funding_round_type", this.funding_round_type);
    __sqoop$field_map.put("funding_round_code", this.funding_round_code);
    __sqoop$field_map.put("raised_amount_usd", this.raised_amount_usd);
    __sqoop$field_map.put("raised_amount", this.raised_amount);
    __sqoop$field_map.put("raised_currency_code", this.raised_currency_code);
    __sqoop$field_map.put("pre_money_valuation_usd", this.pre_money_valuation_usd);
    __sqoop$field_map.put("pre_money_valuation", this.pre_money_valuation);
    __sqoop$field_map.put("pre_money_currency_code", this.pre_money_currency_code);
    __sqoop$field_map.put("post_money_valuation_usd", this.post_money_valuation_usd);
    __sqoop$field_map.put("post_money_valuation", this.post_money_valuation);
    __sqoop$field_map.put("post_money_currency_code", this.post_money_currency_code);
    __sqoop$field_map.put("participants", this.participants);
    __sqoop$field_map.put("is_first_round", this.is_first_round);
    __sqoop$field_map.put("is_last_round", this.is_last_round);
    __sqoop$field_map.put("source_url", this.source_url);
    __sqoop$field_map.put("source_description", this.source_description);
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
