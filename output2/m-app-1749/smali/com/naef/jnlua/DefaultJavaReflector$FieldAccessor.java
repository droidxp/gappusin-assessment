class com.naef.jnlua.DefaultJavaReflector$FieldAccessor implements com.naef.jnlua.DefaultJavaReflector$Accessor {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "FieldAccessor" */
} // .end annotation
/* # instance fields */
private java.lang.reflect.Field field;
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
public com.naef.jnlua.DefaultJavaReflector$FieldAccessor ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.field = p2;
return;
} // .end method
/* # virtual methods */
public Boolean isNotStatic ( ) {
/* .locals 1 */
v0 = this.field;
v0 = (( java.lang.reflect.Field ) v0 ).getModifiers ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I
v0 = java.lang.reflect.Modifier .isStatic ( v0 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isStatic ( ) {
/* .locals 1 */
v0 = this.field;
v0 = (( java.lang.reflect.Field ) v0 ).getModifiers ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I
v0 = java.lang.reflect.Modifier .isStatic ( v0 );
} // .end method
public void read ( com.naef.jnlua.LuaState p0, java.lang.Object p1 ) {
/* .locals 2 */
try { // :try_start_0
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$700 ( v0,p2 );
/* if-ne v0, p2, :cond_0 */
int p2 = 0; // const/4 p2, 0x0
} // :cond_0
v0 = this.field;
(( java.lang.reflect.Field ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
return;
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
/* :catch_1 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public void write ( com.naef.jnlua.LuaState p0, java.lang.Object p1 ) {
/* .locals 2 */
try { // :try_start_0
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$700 ( v0,p2 );
/* if-ne v0, p2, :cond_0 */
int p2 = 0; // const/4 p2, 0x0
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
v1 = this.field;
(( java.lang.reflect.Field ) v1 ).getType ( ); // invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
v1 = this.field;
(( java.lang.reflect.Field ) v1 ).set ( p2, v0 ); // invoke-virtual {v1, p2, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
return;
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
/* :catch_1 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
