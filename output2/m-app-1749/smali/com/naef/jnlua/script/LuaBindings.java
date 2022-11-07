class com.naef.jnlua.script.LuaBindings extends com.naef.jnlua.util.AbstractTableMap implements javax.script.Bindings {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lcom/naef/jnlua/util/AbstractTableMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;", */
	 /* "Ljavax/script/Bindings;" */
	 /* } */
} // .end annotation
/* # instance fields */
private com.naef.jnlua.script.LuaScriptEngine scriptEngine;
/* # direct methods */
public com.naef.jnlua.script.LuaBindings ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lcom/naef/jnlua/util/AbstractTableMap;-><init>()V */
	 this.scriptEngine = p1;
	 return;
} // .end method
/* # virtual methods */
protected Boolean acceptKey ( Integer p0 ) {
	 /* .locals 1 */
	 (( com.naef.jnlua.script.LuaBindings ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaBindings;->getLuaState()Lcom/naef/jnlua/LuaState;
	 v0 = 	 (( com.naef.jnlua.LuaState ) v0 ).isString ( p1 ); // invoke-virtual {v0, p1}, Lcom/naef/jnlua/LuaState;->isString(I)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( com.naef.jnlua.script.LuaBindings ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaBindings;->getLuaState()Lcom/naef/jnlua/LuaState;
		 (( com.naef.jnlua.LuaState ) v0 ).toString ( p1 ); // invoke-virtual {v0, p1}, Lcom/naef/jnlua/LuaState;->toString(I)Ljava/lang/String;
		 v0 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* if-lez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void checkKey ( java.lang.Object p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->checkKey(Ljava/lang/Object;)V */
/* instance-of v0, p1, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "key must be a string"; // const-string v1, "key must be a string"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "key must not be empty"; // const-string v1, "key must not be empty"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
return;
} // .end method
protected java.lang.Object convertKey ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
(( com.naef.jnlua.script.LuaBindings ) p0 ).convertKey ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/script/LuaBindings;->convertKey(I)Ljava/lang/String;
} // .end method
protected java.lang.String convertKey ( Integer p0 ) {
/* .locals 1 */
(( com.naef.jnlua.script.LuaBindings ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaBindings;->getLuaState()Lcom/naef/jnlua/LuaState;
(( com.naef.jnlua.LuaState ) v0 ).toString ( p1 ); // invoke-virtual {v0, p1}, Lcom/naef/jnlua/LuaState;->toString(I)Ljava/lang/String;
} // .end method
protected Boolean filterKeys ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public com.naef.jnlua.LuaState getLuaState ( ) {
/* .locals 1 */
v0 = this.scriptEngine;
(( com.naef.jnlua.script.LuaScriptEngine ) v0 ).getLuaState ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/script/LuaScriptEngine;->getLuaState()Lcom/naef/jnlua/LuaState;
} // .end method
com.naef.jnlua.script.LuaScriptEngine getScriptEngine ( ) {
/* .locals 1 */
v0 = this.scriptEngine;
} // .end method
public void pushValue ( ) {
/* .locals 2 */
(( com.naef.jnlua.script.LuaBindings ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaBindings;->getLuaState()Lcom/naef/jnlua/LuaState;
/* const/16 v1, -0x2712 */
(( com.naef.jnlua.LuaState ) v0 ).pushValue ( v1 ); // invoke-virtual {v0, v1}, Lcom/naef/jnlua/LuaState;->pushValue(I)V
return;
} // .end method
public java.lang.Object put ( java.lang.String p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 1 */
/* invoke-super {p0, p1, p2}, Lcom/naef/jnlua/util/AbstractTableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
} // .end method
