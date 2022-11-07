class inal extends org.codehaus.jackson.impl.JsonWriteContext {
	 /* .source "JsonWriteContext.java" */
	 /* # instance fields */
	 protected java.lang.String _currentName;
	 protected Boolean _expectValue;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .param p1, "parent" # Lorg/codehaus/jackson/impl/JsonWriteContext; */
		 /* .prologue */
		 /* .line 188 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* invoke-direct {p0, v0, p1}, Lorg/codehaus/jackson/impl/JsonWriteContext;-><init>(ILorg/codehaus/jackson/impl/JsonWriteContext;)V */
		 /* .line 189 */
		 int v0 = 0; // const/4 v0, 0x0
		 this._currentName = v0;
		 /* .line 190 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/ObjectWContext;->_expectValue:Z */
		 /* .line 191 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void appendDesc ( java.lang.StringBuilder p0 ) {
		 /* .locals 2 */
		 /* .param p1, "sb" # Ljava/lang/StringBuilder; */
		 /* .prologue */
		 /* const/16 v1, 0x22 */
		 /* .line 216 */
		 /* const/16 v0, 0x7b */
		 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* .line 217 */
		 v0 = this._currentName;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 218 */
			 (( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
			 /* .line 220 */
			 v0 = this._currentName;
			 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* .line 221 */
			 (( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
			 /* .line 225 */
		 } // :goto_0
		 /* const/16 v0, 0x5d */
		 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* .line 226 */
		 return;
		 /* .line 223 */
	 } // :cond_0
	 /* const/16 v0, 0x3f */
	 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // .end method
public java.lang.String getCurrentName ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 193 */
	 v0 = this._currentName;
} // .end method
public Integer writeFieldName ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p1, "name" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 197 */
	 v0 = this._currentName;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 198 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* .line 201 */
	 } // :goto_0
	 /* .line 200 */
} // :cond_0
this._currentName = p1;
/* .line 201 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/ObjectWContext;->_index:I */
/* if-gez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Integer writeValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 206 */
v0 = this._currentName;
/* if-nez v0, :cond_0 */
/* .line 207 */
int v0 = 5; // const/4 v0, 0x5
/* .line 211 */
} // :goto_0
/* .line 209 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
this._currentName = v0;
/* .line 210 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/ObjectWContext;->_index:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/ObjectWContext;->_index:I */
/* .line 211 */
int v0 = 2; // const/4 v0, 0x2
} // .end method
