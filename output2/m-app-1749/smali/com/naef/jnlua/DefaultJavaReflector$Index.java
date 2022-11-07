class com.naef.jnlua.DefaultJavaReflector$Index implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "Index" */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.DefaultJavaReflector$Index ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.DefaultJavaReflector$Index ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$Index;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;)V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 8 */
int v7 = -1; // const/4 v7, -0x1
int v6 = 0; // const/4 v6, 0x0
int v4 = 2; // const/4 v4, 0x2
int v5 = 1; // const/4 v5, 0x1
/* const-class v0, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v5, v0 ); // invoke-virtual {p1, v5, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$700 ( v0,v1 );
v0 = (( java.lang.Class ) v2 ).isArray ( ); // invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z
if ( v0 != null) { // if-eqz v0, :cond_3
	 v0 = 	 (( com.naef.jnlua.LuaState ) p1 ).isNumber ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->isNumber(I)Z
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
	 final String v1 = "attempt to read array with %s accessor"; // const-string v1, "attempt to read array with %s accessor"
	 /* new-array v2, v5, [Ljava/lang/Object; */
	 (( com.naef.jnlua.LuaState ) p1 ).typeName ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
	 /* aput-object v3, v2, v6 */
	 java.lang.String .format ( v1,v2 );
	 /* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
v0 = (( com.naef.jnlua.LuaState ) p1 ).toInteger ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->toInteger(I)I
v2 = java.lang.reflect.Array .getLength ( v1 );
/* if-lt v0, v5, :cond_1 */
/* if-le v0, v2, :cond_2 */
} // :cond_1
/* new-instance v1, Lcom/naef/jnlua/LuaRuntimeException; */
final String v3 = "attempt to read array of length %d at index %d"; // const-string v3, "attempt to read array of length %d at index %d"
/* new-array v4, v4, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v4, v6 */
java.lang.Integer .valueOf ( v0 );
/* aput-object v0, v4, v5 */
java.lang.String .format ( v3,v4 );
/* invoke-direct {v1, v0}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_2
/* add-int/lit8 v0, v0, -0x1 */
java.lang.reflect.Array .get ( v1,v0 );
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // :goto_0
} // :cond_3
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$800 ( v0,v1 );
(( com.naef.jnlua.LuaState ) p1 ).toString ( v7 ); // invoke-virtual {p1, v7}, Lcom/naef/jnlua/LuaState;->toString(I)Ljava/lang/String;
/* if-nez v3, :cond_4 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v2 = "attempt to read class %s with %s accessor"; // const-string v2, "attempt to read class %s with %s accessor"
/* new-array v3, v4, [Ljava/lang/Object; */
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getCanonicalName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v1, v3, v6 */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v7 ); // invoke-virtual {p1, v7}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v1, v3, v5 */
java.lang.String .format ( v2,v3 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_4
/* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Accessor; */
/* if-nez v0, :cond_5 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v1 = "attempt to read class %s with accessor \'%s\' (undefined)"; // const-string v1, "attempt to read class %s with accessor \'%s\' (undefined)"
/* new-array v4, v4, [Ljava/lang/Object; */
(( java.lang.Class ) v2 ).getCanonicalName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v2, v4, v6 */
/* aput-object v3, v4, v5 */
java.lang.String .format ( v1,v4 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_5
} // .end method
