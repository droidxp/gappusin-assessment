public abstract class org.codehaus.jackson.JsonStreamContext {
	 /* .source "JsonStreamContext.java" */
	 /* # static fields */
	 protected static final Integer TYPE_ARRAY;
	 protected static final Integer TYPE_OBJECT;
	 protected static final Integer TYPE_ROOT;
	 /* # instance fields */
	 protected Integer _index;
	 protected Integer _type;
	 /* # direct methods */
	 public org.codehaus.jackson.JsonStreamContext ( ) {
		 /* .locals 1 */
		 /* .param p1, "type" # I */
		 /* .prologue */
		 /* .line 54 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 55 */
		 /* iput p1, p0, Lorg/codehaus/jackson/JsonStreamContext;->_type:I */
		 /* .line 56 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lorg/codehaus/jackson/JsonStreamContext;->_index:I */
		 /* .line 57 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer getCurrentIndex ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 108 */
		 /* iget v0, p0, Lorg/codehaus/jackson/JsonStreamContext;->_index:I */
		 /* if-gez v0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/JsonStreamContext;->_index:I */
} // .end method
public abstract java.lang.String getCurrentName ( ) {
} // .end method
public final Integer getEntryCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonStreamContext;->_index:I */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public abstract org.codehaus.jackson.JsonStreamContext getParent ( ) {
} // .end method
public final java.lang.String getTypeDesc ( ) {
/* .locals 1 */
/* .prologue */
/* .line 87 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonStreamContext;->_type:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 92 */
final String v0 = "?"; // const-string v0, "?"
} // :goto_0
/* .line 88 */
/* :pswitch_0 */
final String v0 = "ROOT"; // const-string v0, "ROOT"
/* .line 89 */
/* :pswitch_1 */
final String v0 = "ARRAY"; // const-string v0, "ARRAY"
/* .line 90 */
/* :pswitch_2 */
final String v0 = "OBJECT"; // const-string v0, "OBJECT"
/* .line 87 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public final Boolean inArray ( ) {
/* .locals 2 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 71 */
/* iget v1, p0, Lorg/codehaus/jackson/JsonStreamContext;->_type:I */
/* if-ne v1, v0, :cond_0 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean inObject ( ) {
/* .locals 2 */
/* .prologue */
/* .line 84 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonStreamContext;->_type:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean inRoot ( ) {
/* .locals 1 */
/* .prologue */
/* .line 78 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonStreamContext;->_type:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
