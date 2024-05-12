// ORM class for table 'relationships'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun May 12 11:44:04 MSK 2024
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

public class relationships extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.id = (Integer)value;
      }
    });
    setters.put("relationship_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.relationship_id = (Long)value;
      }
    });
    setters.put("person_object_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.person_object_id = (String)value;
      }
    });
    setters.put("relationship_object_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.relationship_object_id = (String)value;
      }
    });
    setters.put("start_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.start_at = (java.sql.Date)value;
      }
    });
    setters.put("end_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.end_at = (java.sql.Date)value;
      }
    });
    setters.put("is_past", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.is_past = (Boolean)value;
      }
    });
    setters.put("sequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.sequence = (Long)value;
      }
    });
    setters.put("title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.title = (String)value;
      }
    });
    setters.put("created_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.created_at = (java.sql.Timestamp)value;
      }
    });
    setters.put("updated_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        relationships.this.updated_at = (java.sql.Timestamp)value;
      }
    });
  }
  public relationships() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public relationships with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Long relationship_id;
  public Long get_relationship_id() {
    return relationship_id;
  }
  public void set_relationship_id(Long relationship_id) {
    this.relationship_id = relationship_id;
  }
  public relationships with_relationship_id(Long relationship_id) {
    this.relationship_id = relationship_id;
    return this;
  }
  private String person_object_id;
  public String get_person_object_id() {
    return person_object_id;
  }
  public void set_person_object_id(String person_object_id) {
    this.person_object_id = person_object_id;
  }
  public relationships with_person_object_id(String person_object_id) {
    this.person_object_id = person_object_id;
    return this;
  }
  private String relationship_object_id;
  public String get_relationship_object_id() {
    return relationship_object_id;
  }
  public void set_relationship_object_id(String relationship_object_id) {
    this.relationship_object_id = relationship_object_id;
  }
  public relationships with_relationship_object_id(String relationship_object_id) {
    this.relationship_object_id = relationship_object_id;
    return this;
  }
  private java.sql.Date start_at;
  public java.sql.Date get_start_at() {
    return start_at;
  }
  public void set_start_at(java.sql.Date start_at) {
    this.start_at = start_at;
  }
  public relationships with_start_at(java.sql.Date start_at) {
    this.start_at = start_at;
    return this;
  }
  private java.sql.Date end_at;
  public java.sql.Date get_end_at() {
    return end_at;
  }
  public void set_end_at(java.sql.Date end_at) {
    this.end_at = end_at;
  }
  public relationships with_end_at(java.sql.Date end_at) {
    this.end_at = end_at;
    return this;
  }
  private Boolean is_past;
  public Boolean get_is_past() {
    return is_past;
  }
  public void set_is_past(Boolean is_past) {
    this.is_past = is_past;
  }
  public relationships with_is_past(Boolean is_past) {
    this.is_past = is_past;
    return this;
  }
  private Long sequence;
  public Long get_sequence() {
    return sequence;
  }
  public void set_sequence(Long sequence) {
    this.sequence = sequence;
  }
  public relationships with_sequence(Long sequence) {
    this.sequence = sequence;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public relationships with_title(String title) {
    this.title = title;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public relationships with_created_at(java.sql.Timestamp created_at) {
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
  public relationships with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof relationships)) {
      return false;
    }
    relationships that = (relationships) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.relationship_id == null ? that.relationship_id == null : this.relationship_id.equals(that.relationship_id));
    equal = equal && (this.person_object_id == null ? that.person_object_id == null : this.person_object_id.equals(that.person_object_id));
    equal = equal && (this.relationship_object_id == null ? that.relationship_object_id == null : this.relationship_object_id.equals(that.relationship_object_id));
    equal = equal && (this.start_at == null ? that.start_at == null : this.start_at.equals(that.start_at));
    equal = equal && (this.end_at == null ? that.end_at == null : this.end_at.equals(that.end_at));
    equal = equal && (this.is_past == null ? that.is_past == null : this.is_past.equals(that.is_past));
    equal = equal && (this.sequence == null ? that.sequence == null : this.sequence.equals(that.sequence));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof relationships)) {
      return false;
    }
    relationships that = (relationships) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.relationship_id == null ? that.relationship_id == null : this.relationship_id.equals(that.relationship_id));
    equal = equal && (this.person_object_id == null ? that.person_object_id == null : this.person_object_id.equals(that.person_object_id));
    equal = equal && (this.relationship_object_id == null ? that.relationship_object_id == null : this.relationship_object_id.equals(that.relationship_object_id));
    equal = equal && (this.start_at == null ? that.start_at == null : this.start_at.equals(that.start_at));
    equal = equal && (this.end_at == null ? that.end_at == null : this.end_at.equals(that.end_at));
    equal = equal && (this.is_past == null ? that.is_past == null : this.is_past.equals(that.is_past));
    equal = equal && (this.sequence == null ? that.sequence == null : this.sequence.equals(that.sequence));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.relationship_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.person_object_id = JdbcWritableBridge.readString(3, __dbResults);
    this.relationship_object_id = JdbcWritableBridge.readString(4, __dbResults);
    this.start_at = JdbcWritableBridge.readDate(5, __dbResults);
    this.end_at = JdbcWritableBridge.readDate(6, __dbResults);
    this.is_past = JdbcWritableBridge.readBoolean(7, __dbResults);
    this.sequence = JdbcWritableBridge.readLong(8, __dbResults);
    this.title = JdbcWritableBridge.readString(9, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.relationship_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.person_object_id = JdbcWritableBridge.readString(3, __dbResults);
    this.relationship_object_id = JdbcWritableBridge.readString(4, __dbResults);
    this.start_at = JdbcWritableBridge.readDate(5, __dbResults);
    this.end_at = JdbcWritableBridge.readDate(6, __dbResults);
    this.is_past = JdbcWritableBridge.readBoolean(7, __dbResults);
    this.sequence = JdbcWritableBridge.readLong(8, __dbResults);
    this.title = JdbcWritableBridge.readString(9, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(11, __dbResults);
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
    JdbcWritableBridge.writeLong(relationship_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(person_object_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(relationship_object_id, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(start_at, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(end_at, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_past, 7 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeLong(sequence, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(title, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(relationship_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(person_object_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(relationship_object_id, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(start_at, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(end_at, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBoolean(is_past, 7 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeLong(sequence, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(title, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 11 + __off, 93, __dbStmt);
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
        this.relationship_id = null;
    } else {
    this.relationship_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.person_object_id = null;
    } else {
    this.person_object_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.relationship_object_id = null;
    } else {
    this.relationship_object_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.start_at = null;
    } else {
    this.start_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.end_at = null;
    } else {
    this.end_at = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.is_past = null;
    } else {
    this.is_past = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.sequence = null;
    } else {
    this.sequence = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
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
    if (null == this.relationship_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.relationship_id);
    }
    if (null == this.person_object_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, person_object_id);
    }
    if (null == this.relationship_object_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, relationship_object_id);
    }
    if (null == this.start_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_at.getTime());
    }
    if (null == this.end_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_at.getTime());
    }
    if (null == this.is_past) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_past);
    }
    if (null == this.sequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sequence);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
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
    if (null == this.relationship_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.relationship_id);
    }
    if (null == this.person_object_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, person_object_id);
    }
    if (null == this.relationship_object_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, relationship_object_id);
    }
    if (null == this.start_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_at.getTime());
    }
    if (null == this.end_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_at.getTime());
    }
    if (null == this.is_past) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.is_past);
    }
    if (null == this.sequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sequence);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
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
    __sb.append(FieldFormatter.escapeAndEnclose(relationship_id==null?"null":"" + relationship_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(person_object_id==null?"null":person_object_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(relationship_object_id==null?"null":relationship_object_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_at==null?"null":"" + start_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_at==null?"null":"" + end_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_past==null?"null":"" + is_past, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sequence==null?"null":"" + sequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(relationship_id==null?"null":"" + relationship_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(person_object_id==null?"null":person_object_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(relationship_object_id==null?"null":relationship_object_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_at==null?"null":"" + start_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_at==null?"null":"" + end_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(is_past==null?"null":"" + is_past, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sequence==null?"null":"" + sequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.relationship_id = null; } else {
      this.relationship_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.person_object_id = null; } else {
      this.person_object_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.relationship_object_id = null; } else {
      this.relationship_object_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_at = null; } else {
      this.start_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_at = null; } else {
      this.end_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_past = null; } else {
      this.is_past = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sequence = null; } else {
      this.sequence = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.relationship_id = null; } else {
      this.relationship_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.person_object_id = null; } else {
      this.person_object_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.relationship_object_id = null; } else {
      this.relationship_object_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_at = null; } else {
      this.start_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_at = null; } else {
      this.end_at = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.is_past = null; } else {
      this.is_past = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sequence = null; } else {
      this.sequence = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
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
    relationships o = (relationships) super.clone();
    o.start_at = (o.start_at != null) ? (java.sql.Date) o.start_at.clone() : null;
    o.end_at = (o.end_at != null) ? (java.sql.Date) o.end_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    return o;
  }

  public void clone0(relationships o) throws CloneNotSupportedException {
    o.start_at = (o.start_at != null) ? (java.sql.Date) o.start_at.clone() : null;
    o.end_at = (o.end_at != null) ? (java.sql.Date) o.end_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("relationship_id", this.relationship_id);
    __sqoop$field_map.put("person_object_id", this.person_object_id);
    __sqoop$field_map.put("relationship_object_id", this.relationship_object_id);
    __sqoop$field_map.put("start_at", this.start_at);
    __sqoop$field_map.put("end_at", this.end_at);
    __sqoop$field_map.put("is_past", this.is_past);
    __sqoop$field_map.put("sequence", this.sequence);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("relationship_id", this.relationship_id);
    __sqoop$field_map.put("person_object_id", this.person_object_id);
    __sqoop$field_map.put("relationship_object_id", this.relationship_object_id);
    __sqoop$field_map.put("start_at", this.start_at);
    __sqoop$field_map.put("end_at", this.end_at);
    __sqoop$field_map.put("is_past", this.is_past);
    __sqoop$field_map.put("sequence", this.sequence);
    __sqoop$field_map.put("title", this.title);
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
