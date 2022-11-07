class com.naef.jnlua.DefaultJavaReflector$NewIndex implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "NewIndex" */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.DefaultJavaReflector$NewIndex ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.DefaultJavaReflector$NewIndex ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$NewIndex;-><init>(Lcom/naef/jnlua/DefaultJavaReflector;)V */
return;
} // .end method
/* # virtual methods */
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 8 */
int v7 = 3; // const/4 v7, 0x3
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
int v4 = 2; // const/4 v4, 0x2
/* const-class v0, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v6, v0 ); // invoke-virtual {p1, v6, v0}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$700 ( v0,v1 );
v0 = (( java.lang.Class ) v2 ).isArray ( ); // invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z
if ( v0 != null) { // if-eqz v0, :cond_4
	 v0 = 	 (( com.naef.jnlua.LuaState ) p1 ).isNumber ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->isNumber(I)Z
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
	 final String v1 = "attempt to write array with %s accessor"; // const-string v1, "attempt to write array with %s accessor"
	 /* new-array v2, v6, [Ljava/lang/Object; */
	 (( com.naef.jnlua.LuaState ) p1 ).typeName ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
	 /* aput-object v3, v2, v5 */
	 java.lang.String .format ( v1,v2 );
	 /* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
v0 = (( com.naef.jnlua.LuaState ) p1 ).toInteger ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->toInteger(I)I
v3 = java.lang.reflect.Array .getLength ( v1 );
/* if-lt v0, v6, :cond_1 */
/* if-le v0, v3, :cond_2 */
} // :cond_1
/* new-instance v1, Lcom/naef/jnlua/LuaRuntimeException; */
final String v2 = "attempt to write array of length %d at index %d"; // const-string v2, "attempt to write array of length %d at index %d"
/* new-array v4, v4, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v4, v5 */
java.lang.Integer .valueOf ( v0 );
/* aput-object v0, v4, v6 */
java.lang.String .format ( v2,v4 );
/* invoke-direct {v1, v0}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_2
(( java.lang.Class ) v2 ).getComponentType ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
v3 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObject ( v7, v2 ); // invoke-virtual {p1, v7, v2}, Lcom/naef/jnlua/LuaState;->isJavaObject(ILjava/lang/Class;)Z
/* if-nez v3, :cond_3 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v1 = "attempt to write array of %s at index %d with %s value"; // const-string v1, "attempt to write array of %s at index %d with %s value"
/* new-array v3, v4, [Ljava/lang/Object; */
(( java.lang.Class ) v2 ).getCanonicalName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v2, v3, v5 */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v7 ); // invoke-virtual {p1, v7}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v2, v3, v6 */
java.lang.String .format ( v1,v3 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_3
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v7, v2 ); // invoke-virtual {p1, v7, v2}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* add-int/lit8 v0, v0, -0x1 */
java.lang.reflect.Array .set ( v1,v0,v2 );
} // :goto_0
} // :cond_4
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$800 ( v0,v1 );
(( com.naef.jnlua.LuaState ) p1 ).toString ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->toString(I)Ljava/lang/String;
/* if-nez v3, :cond_5 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v2 = "attempt to write class %s with %s accessor"; // const-string v2, "attempt to write class %s with %s accessor"
/* new-array v3, v4, [Ljava/lang/Object; */
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getCanonicalName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v1, v3, v5 */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v4 ); // invoke-virtual {p1, v4}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v1, v3, v6 */
java.lang.String .format ( v2,v3 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_5
/* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Accessor; */
/* if-nez v0, :cond_6 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v1 = "attempt to write class %s with accessor \'%s\' (undefined)"; // const-string v1, "attempt to write class %s with accessor \'%s\' (undefined)"
/* new-array v4, v4, [Ljava/lang/Object; */
(( java.lang.Class ) v2 ).getCanonicalName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v2, v4, v5 */
/* aput-object v3, v4, v6 */
java.lang.String .format ( v1,v4 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_6
} // .end method
