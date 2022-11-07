public abstract class org.codehaus.jackson.impl.JsonWriteContext extends org.codehaus.jackson.JsonStreamContext {
	 /* .source "JsonWriteContext.java" */
	 /* # static fields */
	 public static final Integer STATUS_EXPECT_NAME;
	 public static final Integer STATUS_EXPECT_VALUE;
	 public static final Integer STATUS_OK_AFTER_COLON;
	 public static final Integer STATUS_OK_AFTER_COMMA;
	 public static final Integer STATUS_OK_AFTER_SPACE;
	 public static final Integer STATUS_OK_AS_IS;
	 /* # instance fields */
	 org.codehaus.jackson.impl.JsonWriteContext _childArray;
	 org.codehaus.jackson.impl.JsonWriteContext _childObject;
	 protected final org.codehaus.jackson.impl.JsonWriteContext _parent;
	 /* # direct methods */
	 protected org.codehaus.jackson.impl.JsonWriteContext ( ) {
		 /* .locals 1 */
		 /* .param p1, "type" # I */
		 /* .param p2, "parent" # Lorg/codehaus/jackson/impl/JsonWriteContext; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 44 */
		 /* invoke-direct {p0, p1}, Lorg/codehaus/jackson/JsonStreamContext;-><init>(I)V */
		 /* .line 32 */
		 this._childArray = v0;
		 /* .line 34 */
		 this._childObject = v0;
		 /* .line 45 */
		 this._parent = p2;
		 /* .line 46 */
		 return;
	 } // .end method
	 public static org.codehaus.jackson.impl.JsonWriteContext createRootContext ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 52 */
		 /* new-instance v0, Lorg/codehaus/jackson/impl/RootWContext; */
		 /* invoke-direct {v0}, Lorg/codehaus/jackson/impl/RootWContext;-><init>()V */
	 } // .end method
	 /* # virtual methods */
	 protected abstract void appendDesc ( java.lang.StringBuilder p0 ) {
	 } // .end method
	 public final org.codehaus.jackson.impl.JsonWriteContext createChildArrayContext ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 57 */
		 v0 = this._childArray;
		 /* .line 58 */
		 /* .local v0, "ctxt":Lorg/codehaus/jackson/impl/JsonWriteContext; */
		 /* if-nez v0, :cond_0 */
		 /* .line 59 */
		 /* new-instance v0, Lorg/codehaus/jackson/impl/ArrayWContext; */
	 } // .end local v0 # "ctxt":Lorg/codehaus/jackson/impl/JsonWriteContext;
	 /* invoke-direct {v0, p0}, Lorg/codehaus/jackson/impl/ArrayWContext;-><init>(Lorg/codehaus/jackson/impl/JsonWriteContext;)V */
	 /* .restart local v0 # "ctxt":Lorg/codehaus/jackson/impl/JsonWriteContext; */
	 this._childArray = v0;
	 /* .line 63 */
} // :goto_0
/* .line 61 */
} // :cond_0
int v1 = -1; // const/4 v1, -0x1
/* iput v1, v0, Lorg/codehaus/jackson/impl/JsonWriteContext;->_index:I */
} // .end method
public final org.codehaus.jackson.impl.JsonWriteContext createChildObjectContext ( ) {
/* .locals 2 */
/* .prologue */
/* .line 68 */
v0 = this._childObject;
/* .line 69 */
/* .local v0, "ctxt":Lorg/codehaus/jackson/impl/JsonWriteContext; */
/* if-nez v0, :cond_0 */
/* .line 70 */
/* new-instance v0, Lorg/codehaus/jackson/impl/ObjectWContext; */
} // .end local v0 # "ctxt":Lorg/codehaus/jackson/impl/JsonWriteContext;
/* invoke-direct {v0, p0}, Lorg/codehaus/jackson/impl/ObjectWContext;-><init>(Lorg/codehaus/jackson/impl/JsonWriteContext;)V */
/* .restart local v0 # "ctxt":Lorg/codehaus/jackson/impl/JsonWriteContext; */
this._childObject = v0;
/* .line 74 */
} // :goto_0
/* .line 72 */
} // :cond_0
int v1 = -1; // const/4 v1, -0x1
/* iput v1, v0, Lorg/codehaus/jackson/impl/JsonWriteContext;->_index:I */
} // .end method
public org.codehaus.jackson.JsonStreamContext getParent ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 10 */
(( org.codehaus.jackson.impl.JsonWriteContext ) p0 ).getParent ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonWriteContext;->getParent()Lorg/codehaus/jackson/impl/JsonWriteContext;
} // .end method
public final org.codehaus.jackson.impl.JsonWriteContext getParent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
v0 = this._parent;
} // .end method
public final java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 104 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x40 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 105 */
/* .local v0, "sb":Ljava/lang/StringBuilder; */
(( org.codehaus.jackson.impl.JsonWriteContext ) p0 ).appendDesc ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonWriteContext;->appendDesc(Ljava/lang/StringBuilder;)V
/* .line 106 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public abstract Integer writeFieldName ( java.lang.String p0 ) {
} // .end method
public abstract Integer writeValue ( ) {
} // .end method
