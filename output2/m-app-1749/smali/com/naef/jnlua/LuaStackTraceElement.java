public class com.naef.jnlua.LuaStackTraceElement {
	 /* # instance fields */
	 private java.lang.String functionName;
	 private Integer lineNumber;
	 private java.lang.String sourceName;
	 /* # direct methods */
	 public com.naef.jnlua.LuaStackTraceElement ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.functionName = p1;
		 this.sourceName = p2;
		 /* iput p3, p0, Lcom/naef/jnlua/LuaStackTraceElement;->lineNumber:I */
		 return;
	 } // .end method
	 private Boolean safeEquals ( java.lang.Object p0, java.lang.Object p1 ) {
		 /* .locals 1 */
		 /* if-eq p1, p2, :cond_0 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 v0 = 			 (( java.lang.Object ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_1
			 } // :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
	 /* .locals 4 */
	 int v0 = 1; // const/4 v0, 0x1
	 int v1 = 0; // const/4 v1, 0x0
	 /* if-ne p1, p0, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
/* instance-of v2, p1, Lcom/naef/jnlua/LuaStackTraceElement; */
/* if-nez v2, :cond_2 */
/* move v0, v1 */
} // :cond_2
/* check-cast p1, Lcom/naef/jnlua/LuaStackTraceElement; */
v2 = this.functionName;
v3 = this.functionName;
v2 = /* invoke-direct {p0, v2, v3}, Lcom/naef/jnlua/LuaStackTraceElement;->safeEquals(Ljava/lang/Object;Ljava/lang/Object;)Z */
if ( v2 != null) { // if-eqz v2, :cond_3
v2 = this.sourceName;
v3 = this.sourceName;
v2 = /* invoke-direct {p0, v2, v3}, Lcom/naef/jnlua/LuaStackTraceElement;->safeEquals(Ljava/lang/Object;Ljava/lang/Object;)Z */
if ( v2 != null) { // if-eqz v2, :cond_3
/* iget v2, p0, Lcom/naef/jnlua/LuaStackTraceElement;->lineNumber:I */
/* iget v3, p1, Lcom/naef/jnlua/LuaStackTraceElement;->lineNumber:I */
/* if-eq v2, v3, :cond_0 */
} // :cond_3
/* move v0, v1 */
} // .end method
public java.lang.String getFunctionName ( ) {
/* .locals 1 */
v0 = this.functionName;
} // .end method
public Integer getLineNumber ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/naef/jnlua/LuaStackTraceElement;->lineNumber:I */
} // .end method
public java.lang.String getSourceName ( ) {
/* .locals 1 */
v0 = this.sourceName;
} // .end method
public Integer hashCode ( ) {
/* .locals 4 */
/* const v3, 0x1003f */
int v1 = 0; // const/4 v1, 0x0
v0 = this.functionName;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.functionName;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // :goto_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* mul-int/2addr v0, v3 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v2 = this.sourceName;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.sourceName;
v1 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // :cond_0
/* mul-int v0, v1, v3 */
/* iget v1, p0, Lcom/naef/jnlua/LuaStackTraceElement;->lineNumber:I */
/* add-int/2addr v0, v1 */
} // :cond_1
/* move v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
v1 = this.functionName;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.functionName;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :goto_0
final String v1 = " ("; // const-string v1, " ("
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.sourceName;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.sourceName;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* iget v1, p0, Lcom/naef/jnlua/LuaStackTraceElement;->lineNumber:I */
/* if-ltz v1, :cond_0 */
/* const/16 v1, 0x3a */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* iget v1, p0, Lcom/naef/jnlua/LuaStackTraceElement;->lineNumber:I */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
} // :cond_0
} // :goto_1
/* const/16 v1, 0x29 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_1
final String v1 = "(Unknown Function)"; // const-string v1, "(Unknown Function)"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_2
final String v1 = "External Function"; // const-string v1, "External Function"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // .end method
