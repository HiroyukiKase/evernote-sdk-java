/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.type;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import com.evernote.thrift.*;
import com.evernote.thrift.protocol.*;

/**
 * A structure that describes a notebook or a user's relationship with
 * a notebook. NotebookDescriptor is expected to remain a lighter-weight
 * structure when compared to Notebook.
 * <dl>
 * <dt>guid</dt>
 *   <dd>The unique identifier of the notebook.
 *   </dd>
 * 
 * <dt>notebookDisplayName</dt>
 *   <dd>A sequence of characters representing the name of the
 *   notebook.
 *   </dd>
 * 
 * <dt>contactName</dt>
 *   <dd>The User.name value of the notebook's "contact".
 *   </dd>
 * 
 * <dt>hasSharedNotebook</dt>
 *   <dd>Whether a SharedNotebook record exists between the calling user and this
 *   notebook.
 *   </dd>
 * 
 * <dt>joinedUserCount</dt>
 *   <dd>The number of users who have joined this notebook.
 *   </dd>
 * 
 * </dl>
 */
public class NotebookDescriptor implements TBase<NotebookDescriptor>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("NotebookDescriptor");

  private static final TField GUID_FIELD_DESC = new TField("guid", TType.STRING, (short)1);
  private static final TField NOTEBOOK_DISPLAY_NAME_FIELD_DESC = new TField("notebookDisplayName", TType.STRING, (short)2);
  private static final TField CONTACT_NAME_FIELD_DESC = new TField("contactName", TType.STRING, (short)3);
  private static final TField HAS_SHARED_NOTEBOOK_FIELD_DESC = new TField("hasSharedNotebook", TType.BOOL, (short)4);
  private static final TField JOINED_USER_COUNT_FIELD_DESC = new TField("joinedUserCount", TType.I32, (short)5);

  private String guid;
  private String notebookDisplayName;
  private String contactName;
  private boolean hasSharedNotebook;
  private int joinedUserCount;


  // isset id assignments
  private static final int __HASSHAREDNOTEBOOK_ISSET_ID = 0;
  private static final int __JOINEDUSERCOUNT_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public NotebookDescriptor() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NotebookDescriptor(NotebookDescriptor other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetGuid()) {
      this.guid = other.guid;
    }
    if (other.isSetNotebookDisplayName()) {
      this.notebookDisplayName = other.notebookDisplayName;
    }
    if (other.isSetContactName()) {
      this.contactName = other.contactName;
    }
    this.hasSharedNotebook = other.hasSharedNotebook;
    this.joinedUserCount = other.joinedUserCount;
  }

  public NotebookDescriptor deepCopy() {
    return new NotebookDescriptor(this);
  }

  public void clear() {
    this.guid = null;
    this.notebookDisplayName = null;
    this.contactName = null;
    setHasSharedNotebookIsSet(false);
    this.hasSharedNotebook = false;
    setJoinedUserCountIsSet(false);
    this.joinedUserCount = 0;
  }

  public String getGuid() {
    return this.guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public void unsetGuid() {
    this.guid = null;
  }

  /** Returns true if field guid is set (has been asigned a value) and false otherwise */
  public boolean isSetGuid() {
    return this.guid != null;
  }

  public void setGuidIsSet(boolean value) {
    if (!value) {
      this.guid = null;
    }
  }

  public String getNotebookDisplayName() {
    return this.notebookDisplayName;
  }

  public void setNotebookDisplayName(String notebookDisplayName) {
    this.notebookDisplayName = notebookDisplayName;
  }

  public void unsetNotebookDisplayName() {
    this.notebookDisplayName = null;
  }

  /** Returns true if field notebookDisplayName is set (has been asigned a value) and false otherwise */
  public boolean isSetNotebookDisplayName() {
    return this.notebookDisplayName != null;
  }

  public void setNotebookDisplayNameIsSet(boolean value) {
    if (!value) {
      this.notebookDisplayName = null;
    }
  }

  public String getContactName() {
    return this.contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public void unsetContactName() {
    this.contactName = null;
  }

  /** Returns true if field contactName is set (has been asigned a value) and false otherwise */
  public boolean isSetContactName() {
    return this.contactName != null;
  }

  public void setContactNameIsSet(boolean value) {
    if (!value) {
      this.contactName = null;
    }
  }

  public boolean isHasSharedNotebook() {
    return this.hasSharedNotebook;
  }

  public void setHasSharedNotebook(boolean hasSharedNotebook) {
    this.hasSharedNotebook = hasSharedNotebook;
    setHasSharedNotebookIsSet(true);
  }

  public void unsetHasSharedNotebook() {
    __isset_vector[__HASSHAREDNOTEBOOK_ISSET_ID] = false;
  }

  /** Returns true if field hasSharedNotebook is set (has been asigned a value) and false otherwise */
  public boolean isSetHasSharedNotebook() {
    return __isset_vector[__HASSHAREDNOTEBOOK_ISSET_ID];
  }

  public void setHasSharedNotebookIsSet(boolean value) {
    __isset_vector[__HASSHAREDNOTEBOOK_ISSET_ID] = value;
  }

  public int getJoinedUserCount() {
    return this.joinedUserCount;
  }

  public void setJoinedUserCount(int joinedUserCount) {
    this.joinedUserCount = joinedUserCount;
    setJoinedUserCountIsSet(true);
  }

  public void unsetJoinedUserCount() {
    __isset_vector[__JOINEDUSERCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field joinedUserCount is set (has been asigned a value) and false otherwise */
  public boolean isSetJoinedUserCount() {
    return __isset_vector[__JOINEDUSERCOUNT_ISSET_ID];
  }

  public void setJoinedUserCountIsSet(boolean value) {
    __isset_vector[__JOINEDUSERCOUNT_ISSET_ID] = value;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NotebookDescriptor)
      return this.equals((NotebookDescriptor)that);
    return false;
  }

  public boolean equals(NotebookDescriptor that) {
    if (that == null)
      return false;

    boolean this_present_guid = true && this.isSetGuid();
    boolean that_present_guid = true && that.isSetGuid();
    if (this_present_guid || that_present_guid) {
      if (!(this_present_guid && that_present_guid))
        return false;
      if (!this.guid.equals(that.guid))
        return false;
    }

    boolean this_present_notebookDisplayName = true && this.isSetNotebookDisplayName();
    boolean that_present_notebookDisplayName = true && that.isSetNotebookDisplayName();
    if (this_present_notebookDisplayName || that_present_notebookDisplayName) {
      if (!(this_present_notebookDisplayName && that_present_notebookDisplayName))
        return false;
      if (!this.notebookDisplayName.equals(that.notebookDisplayName))
        return false;
    }

    boolean this_present_contactName = true && this.isSetContactName();
    boolean that_present_contactName = true && that.isSetContactName();
    if (this_present_contactName || that_present_contactName) {
      if (!(this_present_contactName && that_present_contactName))
        return false;
      if (!this.contactName.equals(that.contactName))
        return false;
    }

    boolean this_present_hasSharedNotebook = true && this.isSetHasSharedNotebook();
    boolean that_present_hasSharedNotebook = true && that.isSetHasSharedNotebook();
    if (this_present_hasSharedNotebook || that_present_hasSharedNotebook) {
      if (!(this_present_hasSharedNotebook && that_present_hasSharedNotebook))
        return false;
      if (this.hasSharedNotebook != that.hasSharedNotebook)
        return false;
    }

    boolean this_present_joinedUserCount = true && this.isSetJoinedUserCount();
    boolean that_present_joinedUserCount = true && that.isSetJoinedUserCount();
    if (this_present_joinedUserCount || that_present_joinedUserCount) {
      if (!(this_present_joinedUserCount && that_present_joinedUserCount))
        return false;
      if (this.joinedUserCount != that.joinedUserCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(NotebookDescriptor other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    NotebookDescriptor typedOther = (NotebookDescriptor)other;

    lastComparison = Boolean.valueOf(isSetGuid()).compareTo(typedOther.isSetGuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuid()) {      lastComparison = TBaseHelper.compareTo(this.guid, typedOther.guid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotebookDisplayName()).compareTo(typedOther.isSetNotebookDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotebookDisplayName()) {      lastComparison = TBaseHelper.compareTo(this.notebookDisplayName, typedOther.notebookDisplayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContactName()).compareTo(typedOther.isSetContactName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContactName()) {      lastComparison = TBaseHelper.compareTo(this.contactName, typedOther.contactName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHasSharedNotebook()).compareTo(typedOther.isSetHasSharedNotebook());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasSharedNotebook()) {      lastComparison = TBaseHelper.compareTo(this.hasSharedNotebook, typedOther.hasSharedNotebook);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJoinedUserCount()).compareTo(typedOther.isSetJoinedUserCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJoinedUserCount()) {      lastComparison = TBaseHelper.compareTo(this.joinedUserCount, typedOther.joinedUserCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // GUID
          if (field.type == TType.STRING) {
            this.guid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NOTEBOOK_DISPLAY_NAME
          if (field.type == TType.STRING) {
            this.notebookDisplayName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CONTACT_NAME
          if (field.type == TType.STRING) {
            this.contactName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // HAS_SHARED_NOTEBOOK
          if (field.type == TType.BOOL) {
            this.hasSharedNotebook = iprot.readBool();
            setHasSharedNotebookIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // JOINED_USER_COUNT
          if (field.type == TType.I32) {
            this.joinedUserCount = iprot.readI32();
            setJoinedUserCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.guid != null) {
      if (isSetGuid()) {
        oprot.writeFieldBegin(GUID_FIELD_DESC);
        oprot.writeString(this.guid);
        oprot.writeFieldEnd();
      }
    }
    if (this.notebookDisplayName != null) {
      if (isSetNotebookDisplayName()) {
        oprot.writeFieldBegin(NOTEBOOK_DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(this.notebookDisplayName);
        oprot.writeFieldEnd();
      }
    }
    if (this.contactName != null) {
      if (isSetContactName()) {
        oprot.writeFieldBegin(CONTACT_NAME_FIELD_DESC);
        oprot.writeString(this.contactName);
        oprot.writeFieldEnd();
      }
    }
    if (isSetHasSharedNotebook()) {
      oprot.writeFieldBegin(HAS_SHARED_NOTEBOOK_FIELD_DESC);
      oprot.writeBool(this.hasSharedNotebook);
      oprot.writeFieldEnd();
    }
    if (isSetJoinedUserCount()) {
      oprot.writeFieldBegin(JOINED_USER_COUNT_FIELD_DESC);
      oprot.writeI32(this.joinedUserCount);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NotebookDescriptor(");
    boolean first = true;

    if (isSetGuid()) {
      sb.append("guid:");
      if (this.guid == null) {
        sb.append("null");
      } else {
        sb.append(this.guid);
      }
      first = false;
    }
    if (isSetNotebookDisplayName()) {
      if (!first) sb.append(", ");
      sb.append("notebookDisplayName:");
      if (this.notebookDisplayName == null) {
        sb.append("null");
      } else {
        sb.append(this.notebookDisplayName);
      }
      first = false;
    }
    if (isSetContactName()) {
      if (!first) sb.append(", ");
      sb.append("contactName:");
      if (this.contactName == null) {
        sb.append("null");
      } else {
        sb.append(this.contactName);
      }
      first = false;
    }
    if (isSetHasSharedNotebook()) {
      if (!first) sb.append(", ");
      sb.append("hasSharedNotebook:");
      sb.append(this.hasSharedNotebook);
      first = false;
    }
    if (isSetJoinedUserCount()) {
      if (!first) sb.append(", ");
      sb.append("joinedUserCount:");
      sb.append(this.joinedUserCount);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

