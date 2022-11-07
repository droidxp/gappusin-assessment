public class org.codehaus.jackson.JsonLocation implements java.io.Serializable {
	 /* .source "JsonLocation.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final org.codehaus.jackson.JsonLocation NA;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 final Integer _columnNr;
	 final Integer _lineNr;
	 final java.lang.Object _sourceRef;
	 final Long _totalBytes;
	 final Long _totalChars;
	 /* # direct methods */
	 static org.codehaus.jackson.JsonLocation ( ) {
		 /* .locals 8 */
		 /* .prologue */
		 /* const-wide/16 v2, -0x1 */
		 int v6 = -1; // const/4 v6, -0x1
		 /* .line 22 */
		 /* new-instance v0, Lorg/codehaus/jackson/JsonLocation; */
		 final String v1 = "N/A"; // const-string v1, "N/A"
		 /* move-wide v4, v2 */
		 /* move v7, v6 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/codehaus/jackson/JsonLocation;-><init>(Ljava/lang/Object;JJII)V */
		 return;
	 } // .end method
	 public org.codehaus.jackson.JsonLocation ( ) {
		 /* .locals 8 */
		 /* .param p1, "srcRef" # Ljava/lang/Object; */
		 /* .param p2, "totalChars" # J */
		 /* .param p4, "lineNr" # I */
		 /* .param p5, "colNr" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* const-wide/16 v2, -0x1 */
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-wide v4, p2 */
		 /* move v6, p4 */
		 /* move v7, p5 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/codehaus/jackson/JsonLocation;-><init>(Ljava/lang/Object;JJII)V */
		 /* .line 43 */
		 return;
	 } // .end method
	 public org.codehaus.jackson.JsonLocation ( ) {
		 /* .locals 0 */
		 /* .param p1, "sourceRef" # Ljava/lang/Object; */
		 /* .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty; */
		 /* value = "sourceRef" */
	 } // .end annotation
} // .end param
/* .param p2, "totalBytes" # J */
/* .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty; */
/* value = "byteOffset" */
} // .end annotation
} // .end param
/* .param p4, "totalChars" # J */
/* .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty; */
/* value = "charOffset" */
} // .end annotation
} // .end param
/* .param p6, "lineNr" # I */
/* .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty; */
/* value = "lineNr" */
} // .end annotation
} // .end param
/* .param p7, "columnNr" # I */
/* .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty; */
/* value = "columnNr" */
} // .end annotation
} // .end param
/* .annotation runtime Lorg/codehaus/jackson/annotate/JsonCreator; */
} // .end annotation
/* .prologue */
/* .line 51 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 52 */
this._sourceRef = p1;
/* .line 53 */
/* iput-wide p2, p0, Lorg/codehaus/jackson/JsonLocation;->_totalBytes:J */
/* .line 54 */
/* iput-wide p4, p0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J */
/* .line 55 */
/* iput p6, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I */
/* .line 56 */
/* iput p7, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I */
/* .line 57 */
return;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 7 */
/* .param p1, "other" # Ljava/lang/Object; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 126 */
/* if-ne p1, p0, :cond_1 */
/* move v2, v1 */
/* .line 135 */
} // :cond_0
} // :goto_0
/* .line 127 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 128 */
/* instance-of v3, p1, Lorg/codehaus/jackson/JsonLocation; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* move-object v0, p1 */
/* .line 129 */
/* check-cast v0, Lorg/codehaus/jackson/JsonLocation; */
/* .line 131 */
/* .local v0, "otherLoc":Lorg/codehaus/jackson/JsonLocation; */
v3 = this._sourceRef;
/* if-nez v3, :cond_3 */
/* .line 132 */
v3 = this._sourceRef;
/* if-nez v3, :cond_0 */
/* .line 135 */
} // :cond_2
/* iget v3, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I */
/* iget v4, v0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I */
/* if-ne v3, v4, :cond_4 */
/* iget v3, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I */
/* iget v4, v0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I */
/* if-ne v3, v4, :cond_4 */
/* iget-wide v3, p0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J */
/* iget-wide v5, v0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J */
/* cmp-long v3, v3, v5 */
/* if-nez v3, :cond_4 */
(( org.codehaus.jackson.JsonLocation ) p0 ).getByteOffset ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonLocation;->getByteOffset()J
/* move-result-wide v3 */
(( org.codehaus.jackson.JsonLocation ) v0 ).getByteOffset ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/JsonLocation;->getByteOffset()J
/* move-result-wide v5 */
/* cmp-long v3, v3, v5 */
/* if-nez v3, :cond_4 */
} // :goto_1
/* move v2, v1 */
/* .line 133 */
} // :cond_3
v3 = this._sourceRef;
v4 = this._sourceRef;
v3 = (( java.lang.Object ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_2 */
} // :cond_4
/* move v1, v2 */
/* .line 135 */
} // .end method
public Long getByteOffset ( ) {
/* .locals 2 */
/* .prologue */
/* .line 91 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/JsonLocation;->_totalBytes:J */
/* return-wide v0 */
} // .end method
public Long getCharOffset ( ) {
/* .locals 2 */
/* .prologue */
/* .line 83 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J */
/* return-wide v0 */
} // .end method
public Integer getColumnNr ( ) {
/* .locals 1 */
/* .prologue */
/* .line 77 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I */
} // .end method
public Integer getLineNr ( ) {
/* .locals 1 */
/* .prologue */
/* .line 72 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I */
} // .end method
public java.lang.Object getSourceRef ( ) {
/* .locals 1 */
/* .prologue */
/* .line 67 */
v0 = this._sourceRef;
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
/* .prologue */
/* .line 115 */
v1 = this._sourceRef;
/* if-nez v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 116 */
/* .local v0, "hash":I */
} // :goto_0
/* iget v1, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I */
/* xor-int/2addr v0, v1 */
/* .line 117 */
/* iget v1, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I */
/* add-int/2addr v0, v1 */
/* .line 118 */
/* iget-wide v1, p0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J */
/* long-to-int v1, v1 */
/* xor-int/2addr v0, v1 */
/* .line 119 */
/* iget-wide v1, p0, Lorg/codehaus/jackson/JsonLocation;->_totalBytes:J */
/* long-to-int v1, v1 */
/* add-int/2addr v0, v1 */
/* .line 120 */
/* .line 115 */
} // .end local v0 # "hash":I
} // :cond_0
v1 = this._sourceRef;
v0 = (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 97 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x50 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 98 */
/* .local v0, "sb":Ljava/lang/StringBuilder; */
final String v1 = "[Source: "; // const-string v1, "[Source: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 99 */
v1 = this._sourceRef;
/* if-nez v1, :cond_0 */
/* .line 100 */
final String v1 = "UNKNOWN"; // const-string v1, "UNKNOWN"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 104 */
} // :goto_0
final String v1 = "; line: "; // const-string v1, "; line: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 105 */
/* iget v1, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 106 */
final String v1 = ", column: "; // const-string v1, ", column: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 107 */
/* iget v1, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 108 */
/* const/16 v1, 0x5d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 109 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 102 */
} // :cond_0
v1 = this._sourceRef;
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end method
