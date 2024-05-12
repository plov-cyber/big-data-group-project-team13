// ORM class for table 'ipos'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun May 12 11:44:30 MSK 2024
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

public class ipos extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.id = (Integer)value;
      }
    });
    setters.put("ipo_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.ipo_id = (Long)value;
      }
    });
    setters.put("object_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.object_id = (String)value;
      }
    });
    setters.put("valuation_amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.valuation_amount = (java.math.BigDecimal)value;
      }
    });
    setters.put("valuation_currency_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.valuation_currency_code = (String)value;
      }
    });
    setters.put("raised_amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.raised_amount = (java.math.BigDecimal)value;
      }
    });
    setters.put("raised_currency_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.raised_currency_code = (String)value;
      }
    });
    setters.put("public_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.public_at = (java.sql.Date)value;
      }
    });
    setters.put("stock_symbol", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.stock_symbol = (String)value;
      }
    });
    setters.put("source_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.source_url = (String)value;
      }
    });
    setters.put("source_description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.source_description = (String)value;
      }
    });
    setters.put("created_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.created_at = (java.sql.Timestamp)value;
      }
    });
    setters.put("updated_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ipos.this.updated_at = (java.sql.Timestamp)value;
      }
    });
  }
  public ipos() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public ipos with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Long ipo_id;
  public Long get_ipo_id() {
    return ipo_id;
  }
  public void set_ipo_id(Long ipo_id) {
    this.ipo_id = ipo_id;
  }
  public ipos with_ipo_id(Long ipo_id) {
    this.ipo_id = ipo_id;
    return this;
  }
  private String object_id;
  public String get_object_id() {
    return object_id;
  }
  public void set_object_id(String object_id) {
    this.object_id = object_id;
  }
  public ipos with_object_id(String object_id) {
    this.object_id = object_id;
    return this;
  }
  private java.math.BigDecimal valuation_amount;
  public java.math.BigDecimal get_valuation_amount() {
    return valuation_amount;
  }
  public void set_valuation_amount(java.math.BigDecimal valuation_amount) {
    this.valuation_amount = valuation_amount;
  }
  public ipos with_valuation_amount(java.math.BigDecimal valuation_amount) {
    this.valuation_amount = valuation_amount;
    return this;
  }
  private String valuation_currency_code;
  public String get_valuation_currency_code() {
    return valuation_currency_code;
  }
  public void set_valuation_currency_code(String valuation_currency_code) {
    this.valuation_currency_code = valuation_currency_code;
  }
  public ipos with_valuation_currency_code(String valuation_currency_code) {
    this.valuation_currency_code = valuation_currency_code;
    return this;
  }
  private java.math.BigDecimal raised_amount;
  public java.math.BigDecimal get_raised_amount() {
    return raised_amount;
  }
  public void set_raised_amount(java.math.BigDecimal raised_amount) {
    this.raised_amount = raised_amount;
  }
  public ipos with_raised_amount(java.math.BigDecimal raised_amount) {
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
  public ipos with_raised_currency_code(String raised_currency_code) {
    this.raised_currency_code = raised_currency_code;
    return this;
  }
  private java.sql.Date public_at;
  public java.sql.Date get_public_at() {
    return public_at;
  }
  public void set_public_at(java.sql.Date public_at) {
    this.public_at = public_at;
  }
  public ipos with_public_at(java.sql.Date public_at) {
    this.public_at = public_at;
    return this;
  }
  private String stock_symbol;
  public String get_stock_symbol() {
    return stock_symbol;
  }
  public void set_stock_symbol(String stock_symbol) {
    this.stock_symbol = stock_symbol;
  }
  public ipos with_stock_symbol(String stock_symbol) {
    this.stock_symbol = stock_symbol;
    return this;
  }
  private String source_url;
  public String get_source_url() {
    return source_url;
  }
  public void set_source_url(String source_url) {
    this.source_url = source_url;
  }
  public ipos with_source_url(String source_url) {
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
  public ipos with_source_description(String source_description) {
    this.source_description = source_description;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public ipos with_created_at(java.sql.Timestamp created_at) {
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
  public ipos with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ipos)) {
      return false;
    }
    ipos that = (ipos) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.ipo_id == null ? that.ipo_id == null : this.ipo_id.equals(that.ipo_id));
    equal = equal && (this.object_id == null ? that.object_id == null : this.object_id.equals(that.object_id));
    equal = equal && (this.valuation_amount == null ? that.valuation_amount == null : this.valuation_amount.equals(that.valuation_amount));
    equal = equal && (this.valuation_currency_code == null ? that.valuation_currency_code == null : this.valuation_currency_code.equals(that.valuation_currency_code));
    equal = equal && (this.raised_amount == null ? that.raised_amount == null : this.raised_amount.equals(that.raised_amount));
    equal = equal && (this.raised_currency_code == null ? that.raised_currency_code == null : this.raised_currency_code.equals(that.raised_currency_code));
    equal = equal && (this.public_at == null ? that.public_at == null : this.public_at.equals(that.public_at));
    equal = equal && (this.stock_symbol == null ? that.stock_symbol == null : this.stock_symbol.equals(that.stock_symbol));
    equal = equal && (this.source_url == null ? that.source_url == null : this.source_url.equals(that.source_url));
    equal = equal && (this.source_description == null ? that.source_description == null : this.source_description.equals(that.source_description));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ipos)) {
      return false;
    }
    ipos that = (ipos) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.ipo_id == null ? that.ipo_id == null : this.ipo_id.equals(that.ipo_id));
    equal = equal && (this.object_id == null ? that.object_id == null : this.object_id.equals(that.object_id));
    equal = equal && (this.valuation_amount == null ? that.valuation_amount == null : this.valuation_amount.equals(that.valuation_amount));
    equal = equal && (this.valuation_currency_code == null ? that.valuation_currency_code == null : this.valuation_currency_code.equals(that.valuation_currency_code));
    equal = equal && (this.raised_amount == null ? that.raised_amount == null : this.raised_amount.equals(that.raised_amount));
    equal = equal && (this.raised_currency_code == null ? that.raised_currency_code == null : this.raised_currency_code.equals(that.raised_currency_code));
    equal = equal && (this.public_at == null ? that.public_at == null : this.public_at.equals(that.public_at));
    equal = equal && (this.stock_symbol == null ? that.stock_symbol == null : this.stock_symbol.equals(that.stock_symbol));
    equal = equal && (this.source_url == null ? that.source_url == null : this.source_url.equals(that.source_url));
    equal = equal && (this.source_description == null ? that.source_description == null : this.source_description.equals(that.source_description));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.ipo_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.object_id = JdbcWritableBridge.readString(3, __dbResults);
    this.valuation_amount = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.valuation_currency_code = JdbcWritableBridge.readString(5, __dbResults);
    this.raised_amount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.raised_currency_code = JdbcWritableBridge.readString(7, __dbResults);
    this.public_at = JdbcWritableBridge.readDate(8, __dbResults);
    this.stock_symbol = JdbcWritableBridge.readString(9, __dbResults);
    this.source_url = JdbcWritableBridge.readString(10, __dbResults);
    this.source_description = JdbcWritableBridge.readString(11, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.ipo_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.object_id = JdbcWritableBridge.readString(3, __dbResults);
    this.valuation_amount = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.valuation_currency_code = JdbcWritableBridge.readString(5, __dbResults);
    this.raised_amount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.raised_currency_code = JdbcWritableBridge.readString(7, __dbResults);
    this.public_at = JdbcWritableBridge.readDate(8, __dbResults);
    this.stock_symbol = JdbcWritableBridge.readString(9, __dbResults);
    this.source_url = JdbcWritableBridge.readString(10, __dbResults);
    this.source_description = JdbcWritableBridge.readString(11, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeLong(ipo_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(object_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valuation_amount, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(valuation_currency_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(raised_amount, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(raised_currency_code, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(public_at, 8 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(stock_symbol, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_url, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_description, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(ipo_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(object_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valuation_amount, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(valuation_currency_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(raised_amount, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(raised_currency_code, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(public_at, 8 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(stock_symbol, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_url, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_description, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 13 + __off, 93, __dbStmt);
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
        this.ipo_id = null;
    } else {
    this.ipo_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.object_id = null;
    } else {
    this.object_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.valuation_amount = null;
    } else {
    this.valuation_amount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.valuation_currency_code = null;
    } else {
    this.valuation_currency_code = Text.readString(__dataIn);
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
        this.public_at = null;
    } else {
    this.public_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_symbol = null;
    } else {
    this.stock_symbol = Text.readString(__dataIn);
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
    if (null == this.ipo_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ipo_id);
    }
    if (null == this.object_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, object_id);
    }
    if (null == this.valuation_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.valuation_amount, __dataOut);
    }
    if (null == this.valuation_currency_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, valuation_currency_code);
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
    if (null == this.public_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.public_at.getTime());
    }
    if (null == this.stock_symbol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock_symbol);
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
    if (null == this.ipo_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ipo_id);
    }
    if (null == this.object_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, object_id);
    }
    if (null == this.valuation_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.valuation_amount, __dataOut);
    }
    if (null == this.valuation_currency_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, valuation_currency_code);
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
    if (null == this.public_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.public_at.getTime());
    }
    if (null == this.stock_symbol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock_symbol);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ipo_id==null?"null":"" + ipo_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(object_id==null?"null":object_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valuation_amount==null?"null":valuation_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valuation_currency_code==null?"null":valuation_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_amount==null?"null":raised_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_currency_code==null?"null":raised_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(public_at==null?"null":"" + public_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_symbol==null?"null":stock_symbol, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_url==null?"null":source_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_description==null?"null":source_description, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(ipo_id==null?"null":"" + ipo_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(object_id==null?"null":object_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valuation_amount==null?"null":valuation_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valuation_currency_code==null?"null":valuation_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_amount==null?"null":raised_amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(raised_currency_code==null?"null":raised_currency_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(public_at==null?"null":"" + public_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_symbol==null?"null":stock_symbol, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_url==null?"null":source_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_description==null?"null":source_description, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ipo_id = null; } else {
      this.ipo_id = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.valuation_amount = null; } else {
      this.valuation_amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.valuation_currency_code = null; } else {
      this.valuation_currency_code = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.public_at = null; } else {
      this.public_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.stock_symbol = null; } else {
      this.stock_symbol = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ipo_id = null; } else {
      this.ipo_id = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.valuation_amount = null; } else {
      this.valuation_amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.valuation_currency_code = null; } else {
      this.valuation_currency_code = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.public_at = null; } else {
      this.public_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.stock_symbol = null; } else {
      this.stock_symbol = __cur_str;
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
    ipos o = (ipos) super.clone();
    o.public_at = (o.public_at != null) ? (java.sql.Date) o.public_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    return o;
  }

  public void clone0(ipos o) throws CloneNotSupportedException {
    o.public_at = (o.public_at != null) ? (java.sql.Date) o.public_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("ipo_id", this.ipo_id);
    __sqoop$field_map.put("object_id", this.object_id);
    __sqoop$field_map.put("valuation_amount", this.valuation_amount);
    __sqoop$field_map.put("valuation_currency_code", this.valuation_currency_code);
    __sqoop$field_map.put("raised_amount", this.raised_amount);
    __sqoop$field_map.put("raised_currency_code", this.raised_currency_code);
    __sqoop$field_map.put("public_at", this.public_at);
    __sqoop$field_map.put("stock_symbol", this.stock_symbol);
    __sqoop$field_map.put("source_url", this.source_url);
    __sqoop$field_map.put("source_description", this.source_description);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("ipo_id", this.ipo_id);
    __sqoop$field_map.put("object_id", this.object_id);
    __sqoop$field_map.put("valuation_amount", this.valuation_amount);
    __sqoop$field_map.put("valuation_currency_code", this.valuation_currency_code);
    __sqoop$field_map.put("raised_amount", this.raised_amount);
    __sqoop$field_map.put("raised_currency_code", this.raised_currency_code);
    __sqoop$field_map.put("public_at", this.public_at);
    __sqoop$field_map.put("stock_symbol", this.stock_symbol);
    __sqoop$field_map.put("source_url", this.source_url);
    __sqoop$field_map.put("source_description", this.source_description);
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
