class com.naef.jnlua.DefaultJavaReflector$InvocableAccessor implements com.naef.jnlua.DefaultJavaReflector$Accessor implements com.naef.jnlua.JavaFunction {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "InvocableAccessor" */
} // .end annotation
/* # instance fields */
private java.lang.Class clazz;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
} // .end field
private java.util.List invocables;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Invocable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
final com.naef.jnlua.DefaultJavaReflector this$0; //synthetic
/* # direct methods */
public com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/util/Collection", */
/* "<", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Invocable;", */
/* ">;)V" */
/* } */
} // .end annotation
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.clazz = p2;
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
this.invocables = v0;
return;
} // .end method
private com.naef.jnlua.DefaultJavaReflector$Invocable dispatchInvocable ( com.naef.jnlua.LuaState p0, Boolean p1 ) {
/* .locals 15 */
/* new-instance v5, Ljava/util/HashSet; */
v1 = this.invocables;
/* invoke-direct {v5, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = /* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v1 = java.lang.reflect.Modifier .isStatic ( v1 );
/* move/from16 v0, p2 */
/* if-eq v1, v0, :cond_0 */
} // :cond_1
v1 = /* invoke-virtual/range {p1 ..p1}, Lcom/naef/jnlua/LuaState;->getTop()I */
/* add-int/lit8 v6, v1, -0x1 */
} // :cond_2
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
v3 = /* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v1 = if ( v3 != null) { // if-eqz v3, :cond_3
/* add-int/lit8 v1, v1, -0x1 */
/* if-ge v6, v1, :cond_2 */
v1 = } // :cond_3
/* if-eq v6, v1, :cond_2 */
} // :cond_4
/* invoke-virtual/range {p1 ..p1}, Lcom/naef/jnlua/LuaState;->getConverter()Lcom/naef/jnlua/Converter; */
} // :cond_5
v1 = } // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_7
/* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
int v2 = 0; // const/4 v2, 0x0
} // :goto_3
/* if-ge v2, v6, :cond_5 */
/* add-int/lit8 v4, v2, 0x2 */
v4 = /* move-object/from16 v0, p1 */
/* const v8, 0x7fffffff */
/* if-ne v4, v8, :cond_6 */
} // :cond_6
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_7
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* move v3, v2 */
/* move v2, v1 */
v1 = } // :goto_4
if ( v1 != null) { // if-eqz v1, :cond_c
/* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v3 = /* if-nez v3, :cond_8 */
/* if-nez v3, :cond_a */
} // :cond_8
int v3 = 1; // const/4 v3, 0x1
} // :goto_5
v1 = /* if-nez v2, :cond_9 */
if ( v1 != null) { // if-eqz v1, :cond_b
} // :cond_9
int v1 = 1; // const/4 v1, 0x1
} // :goto_6
/* move v2, v1 */
} // :cond_a
int v3 = 0; // const/4 v3, 0x0
} // :cond_b
int v1 = 0; // const/4 v1, 0x0
} // :cond_c
if ( v2 != null) { // if-eqz v2, :cond_e
if ( v3 != null) { // if-eqz v3, :cond_e
} // :cond_d
v1 = } // :goto_7
if ( v1 != null) { // if-eqz v1, :cond_e
v1 = /* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
if ( v1 != null) { // if-eqz v1, :cond_d
} // :cond_e
} // :cond_f
v1 = } // :goto_8
if ( v1 != null) { // if-eqz v1, :cond_14
/* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v2 = } // :cond_10
if ( v2 != null) { // if-eqz v2, :cond_f
/* check-cast v2, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v4 = v3 = /* if-eq v2, v1, :cond_10 */
v3 = java.lang.Math .max ( v3,v4 );
v10 = java.lang.Math .min ( v6,v3 );
int v4 = 0; // const/4 v4, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move v14, v3 */
/* move v3, v4 */
/* move v4, v14 */
} // :goto_9
/* if-ge v4, v10, :cond_13 */
/* add-int/lit8 v11, v4, 0x2 */
v11 = /* move-object/from16 v0, p1 */
/* add-int/lit8 v12, v4, 0x2 */
v12 = /* move-object/from16 v0, p1 */
/* if-gt v12, v11, :cond_10 */
/* if-nez v3, :cond_11 */
/* if-eq v11, v12, :cond_12 */
} // :cond_11
int v3 = 1; // const/4 v3, 0x1
} // :goto_a
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_12
int v3 = 0; // const/4 v3, 0x0
} // :cond_13
if ( v3 != null) { // if-eqz v3, :cond_10
} // :cond_14
} // :cond_15
v1 = } // :goto_b
if ( v1 != null) { // if-eqz v1, :cond_1a
/* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v2 = } // :cond_16
if ( v2 != null) { // if-eqz v2, :cond_15
/* check-cast v2, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v4 = v3 = /* if-eq v2, v1, :cond_16 */
v3 = java.lang.Math .max ( v3,v4 );
v9 = java.lang.Math .min ( v6,v3 );
int v4 = 0; // const/4 v4, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move v14, v3 */
/* move v3, v4 */
/* move v4, v14 */
} // :goto_c
/* if-ge v4, v9, :cond_19 */
v12 = (( java.lang.Class ) v10 ).isAssignableFrom ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v12 != null) { // if-eqz v12, :cond_16
/* if-nez v3, :cond_17 */
/* if-eq v10, v11, :cond_18 */
} // :cond_17
int v3 = 1; // const/4 v3, 0x1
} // :goto_d
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_18
int v3 = 0; // const/4 v3, 0x0
} // :cond_19
if ( v3 != null) { // if-eqz v3, :cond_16
v1 = } // :cond_1a
if ( v1 != null) { // if-eqz v1, :cond_1b
/* invoke-direct/range {p0 ..p1}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getSignatureMismatchException(Lcom/naef/jnlua/LuaState;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v1 */
v1 = } // :cond_1b
int v2 = 1; // const/4 v2, 0x1
/* if-le v1, v2, :cond_1c */
/* move-object/from16 v0, p1 */
/* invoke-direct {p0, v0, v5}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getSignatureAmbivalenceException(Lcom/naef/jnlua/LuaState;Ljava/util/Set;)Lcom/naef/jnlua/LuaRuntimeException; */
/* throw v1 */
} // :cond_1c
/* check-cast v1, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
} // .end method
private java.lang.String getJavaSignatureString ( java.lang.Class[] p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v2, p1 */
/* if-ge v0, v2, :cond_1 */
/* if-lez v0, :cond_0 */
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
/* aget-object v2, p1, v0 */
(( java.lang.Class ) v2 ).getCanonicalName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
private com.naef.jnlua.DefaultJavaReflector$LuaCallSignature getLuaCallSignature ( com.naef.jnlua.LuaState p0 ) {
/* .locals 6 */
v0 = (( com.naef.jnlua.LuaState ) p1 ).getTop ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->getTop()I
/* add-int/lit8 v2, v0, -0x1 */
/* new-array v3, v2, [Ljava/lang/Object; */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
} // :goto_0
/* if-ge v1, v2, :cond_3 */
/* add-int/lit8 v0, v1, 0x2 */
(( com.naef.jnlua.LuaState ) p1 ).type ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->type(I)Lcom/naef/jnlua/LuaType;
v4 = com.naef.jnlua.DefaultJavaReflector$1.$SwitchMap$com$naef$jnlua$LuaType;
v5 = (( com.naef.jnlua.LuaType ) v0 ).ordinal ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaType;->ordinal()I
/* aget v4, v4, v5 */
/* packed-switch v4, :pswitch_data_0 */
/* aput-object v0, v3, v1 */
} // :goto_1
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* :pswitch_0 */
/* add-int/lit8 v0, v1, 0x2 */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaFunction ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->isJavaFunction(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
com.naef.jnlua.DefaultJavaReflector .access$1200 ( );
} // :goto_2
/* aput-object v0, v3, v1 */
} // :cond_0
v0 = com.naef.jnlua.LuaType.FUNCTION;
/* :pswitch_1 */
/* add-int/lit8 v0, v1, 0x2 */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaObjectRaw ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->isJavaObjectRaw(I)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* add-int/lit8 v0, v1, 0x2 */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( v0 ); // invoke-virtual {p1, v0}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
/* instance-of v4, v0, Lcom/naef/jnlua/TypedJavaObject; */
if ( v4 != null) { // if-eqz v4, :cond_1
/* check-cast v0, Lcom/naef/jnlua/TypedJavaObject; */
/* aput-object v0, v3, v1 */
} // :cond_1
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* aput-object v0, v3, v1 */
} // :cond_2
v0 = com.naef.jnlua.LuaType.USERDATA;
/* aput-object v0, v3, v1 */
} // :cond_3
/* new-instance v0, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature; */
v1 = this.clazz;
(( com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ) p0 ).getName ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getName()Ljava/lang/String;
/* invoke-direct {v0, v1, v2, v3}, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
private java.lang.String getLuaSignatureString ( com.naef.jnlua.LuaState p0 ) {
/* .locals 4 */
v0 = (( com.naef.jnlua.LuaState ) p1 ).getTop ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->getTop()I
/* add-int/lit8 v1, v0, -0x1 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v1, :cond_1 */
/* if-lez v0, :cond_0 */
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
/* add-int/lit8 v3, v0, 0x2 */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( v3 ); // invoke-virtual {p1, v3}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
private com.naef.jnlua.LuaRuntimeException getSignatureAmbivalenceException ( com.naef.jnlua.LuaState p0, java.util.Set p1 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/naef/jnlua/LuaState;", */
/* "Ljava/util/Set", */
/* "<", */
/* "Lcom/naef/jnlua/DefaultJavaReflector$Invocable;", */
/* ">;)", */
/* "Lcom/naef/jnlua/LuaRuntimeException;" */
/* } */
} // .end annotation
int v9 = 2; // const/4 v9, 0x2
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "%s \'%s(%s)\' on class %s is ambivalent among "; // const-string v0, "%s \'%s(%s)\' on class %s is ambivalent among "
int v1 = 4; // const/4 v1, 0x4
/* new-array v1, v1, [Ljava/lang/Object; */
(( com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ) p0 ).getWhat ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getWhat()Ljava/lang/String;
/* aput-object v5, v1, v3 */
(( com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ) p0 ).getName ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getName()Ljava/lang/String;
/* aput-object v5, v1, v2 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getLuaSignatureString(Lcom/naef/jnlua/LuaState;)Ljava/lang/String; */
/* aput-object v5, v1, v9 */
int v5 = 3; // const/4 v5, 0x3
v6 = this.clazz;
(( java.lang.Class ) v6 ).getCanonicalName ( ); // invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v6, v1, v5 */
java.lang.String .format ( v0,v1 );
(( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* move v1, v2 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* move v1, v3 */
} // :goto_1
final String v6 = "\'%s(%s)\'"; // const-string v6, "\'%s(%s)\'"
/* new-array v7, v9, [Ljava/lang/Object; */
(( com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ) p0 ).getName ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getName()Ljava/lang/String;
/* aput-object v8, v7, v3 */
/* invoke-direct {p0, v0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getJavaSignatureString([Ljava/lang/Class;)Ljava/lang/String; */
/* aput-object v0, v7, v2 */
java.lang.String .format ( v6,v7 );
(( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
final String v6 = ", "; // const-string v6, ", "
(( java.lang.StringBuffer ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_1
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
} // .end method
private com.naef.jnlua.LuaRuntimeException getSignatureMismatchException ( com.naef.jnlua.LuaState p0 ) {
/* .locals 5 */
/* new-instance v0, Lcom/naef/jnlua/LuaRuntimeException; */
final String v1 = "no %s of class %s matches \'%s(%s)\'"; // const-string v1, "no %s of class %s matches \'%s(%s)\'"
int v2 = 4; // const/4 v2, 0x4
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
(( com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ) p0 ).getWhat ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getWhat()Ljava/lang/String;
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
v4 = this.clazz;
(( java.lang.Class ) v4 ).getCanonicalName ( ); // invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v4, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
(( com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ) p0 ).getName ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getName()Ljava/lang/String;
/* aput-object v4, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getLuaSignatureString(Lcom/naef/jnlua/LuaState;)Ljava/lang/String; */
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
/* invoke-direct {v0, v1}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 2 */
v0 = this.invocables;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
} // .end method
public java.lang.String getWhat ( ) {
/* .locals 2 */
v0 = this.invocables;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
} // .end method
public Integer invoke ( com.naef.jnlua.LuaState p0 ) {
/* .locals 12 */
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* const-class v0, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).checkJavaObject ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Lcom/naef/jnlua/LuaState;->checkJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
v1 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$700 ( v1,v0 );
v4 = this.clazz;
v4 = (( java.lang.Class ) v4 ).isAssignableFrom ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
final String v5 = "class %s is not a subclass of %s"; // const-string v5, "class %s is not a subclass of %s"
int v6 = 2; // const/4 v6, 0x2
/* new-array v6, v6, [Ljava/lang/Object; */
(( java.lang.Class ) v1 ).getCanonicalName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v7, v6, v3 */
v7 = this.clazz;
(( java.lang.Class ) v7 ).getCanonicalName ( ); // invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v7, v6, v2 */
java.lang.String .format ( v5,v6 );
(( com.naef.jnlua.LuaState ) p1 ).checkArg ( v2, v4, v5 ); // invoke-virtual {p1, v2, v4, v5}, Lcom/naef/jnlua/LuaState;->checkArg(IZLjava/lang/String;)V
/* if-ne v1, v0, :cond_8 */
int v0 = 0; // const/4 v0, 0x0
/* move-object v1, v0 */
} // :goto_0
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getLuaCallSignature(Lcom/naef/jnlua/LuaState;)Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature; */
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1000 ( v0 );
try { // :try_start_0
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1100 ( v0 );
/* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
v5 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1000 ( v5 );
/* if-nez v0, :cond_0 */
/* if-nez v1, :cond_1 */
/* move v0, v2 */
} // :goto_1
/* invoke-direct {p0, p1, v0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->dispatchInvocable(Lcom/naef/jnlua/LuaState;Z)Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v5 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1000 ( v5 );
try { // :try_start_1
v5 = this.this$0;
v5 = com.naef.jnlua.DefaultJavaReflector .access$1100 ( v5 );
/* if-nez v5, :cond_2 */
v5 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1100 ( v5 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
} // :goto_2
v4 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1000 ( v4 );
} // :cond_0
v4 = (( com.naef.jnlua.LuaState ) p1 ).getTop ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->getTop()I
v6 = /* add-int/lit8 v5, v4, -0x1 */
v4 = /* new-array v7, v6, [Ljava/lang/Object; */
if ( v4 != null) { // if-eqz v4, :cond_4
/* move v4, v3 */
} // :goto_3
/* add-int/lit8 v8, v6, -0x1 */
/* if-ge v4, v8, :cond_3 */
/* add-int/lit8 v8, v4, 0x2 */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v8, v9 ); // invoke-virtual {p1, v8, v9}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* aput-object v8, v7, v4 */
/* add-int/lit8 v4, v4, 0x1 */
/* :catchall_0 */
/* move-exception v0 */
v1 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1000 ( v1 );
/* throw v0 */
} // :cond_1
/* move v0, v3 */
} // :cond_2
try { // :try_start_2
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1100 ( v0 );
/* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
v1 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$1000 ( v1 );
/* throw v0 */
} // :cond_3
/* add-int/lit8 v4, v6, -0x1 */
/* add-int/lit8 v8, v6, -0x1 */
/* add-int/lit8 v9, v6, -0x1 */
/* sub-int v9, v5, v9 */
java.lang.reflect.Array .newInstance ( v8,v9 );
/* aput-object v8, v7, v4 */
/* add-int/lit8 v4, v6, -0x1 */
} // :goto_4
/* if-ge v4, v5, :cond_5 */
/* add-int/lit8 v8, v6, -0x1 */
/* aget-object v8, v7, v8 */
/* add-int/lit8 v9, v6, -0x1 */
/* sub-int v9, v4, v9 */
/* add-int/lit8 v10, v4, 0x2 */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v10, v11 ); // invoke-virtual {p1, v10, v11}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
java.lang.reflect.Array .set ( v8,v9,v10 );
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_4
/* move v4, v3 */
} // :goto_5
/* if-ge v4, v6, :cond_5 */
/* add-int/lit8 v5, v4, 0x2 */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObject ( v5, v8 ); // invoke-virtual {p1, v5, v8}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* aput-object v5, v7, v4 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_5
try { // :try_start_3
/* :try_end_3 */
/* .catch Ljava/lang/InstantiationException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 ..:try_end_3} :catch_3 */
v5 = java.lang.Void.TYPE;
v0 = /* if-eq v4, v5, :cond_7 */
if ( v0 != null) { // if-eqz v0, :cond_6
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObjectRaw ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaObjectRaw(Ljava/lang/Object;)V
} // :goto_6
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
/* :catch_2 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
/* :catch_3 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // :cond_6
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObject ( v1 ); // invoke-virtual {p1, v1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // :cond_7
/* move v2, v3 */
} // :cond_8
/* move-object v1, v0 */
/* goto/16 :goto_0 */
} // .end method
public Boolean isNotStatic ( ) {
/* .locals 2 */
v0 = this.invocables;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v0 = java.lang.reflect.Modifier .isStatic ( v0 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isStatic ( ) {
/* .locals 2 */
v0 = this.invocables;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* check-cast v0, Lcom/naef/jnlua/DefaultJavaReflector$Invocable; */
v0 = java.lang.reflect.Modifier .isStatic ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void read ( com.naef.jnlua.LuaState p0, java.lang.Object p1 ) {
/* .locals 1 */
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$700 ( v0,p2 );
/* if-ne v0, p2, :cond_0 */
} // :cond_0
(( com.naef.jnlua.LuaState ) p1 ).pushJavaFunction ( p0 ); // invoke-virtual {p1, p0}, Lcom/naef/jnlua/LuaState;->pushJavaFunction(Lcom/naef/jnlua/JavaFunction;)V
return;
} // .end method
public void write ( com.naef.jnlua.LuaState p0, java.lang.Object p1 ) {
/* .locals 5 */
v0 = this.this$0;
com.naef.jnlua.DefaultJavaReflector .access$700 ( v0,p2 );
/* new-instance v1, Lcom/naef/jnlua/LuaRuntimeException; */
final String v2 = "attempt to write class %s with accessor \'%s\' (a %s)"; // const-string v2, "attempt to write class %s with accessor \'%s\' (a %s)"
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
(( java.lang.Class ) v0 ).getCanonicalName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v0, v3, v4 */
int v0 = 1; // const/4 v0, 0x1
(( com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ) p0 ).getName ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getName()Ljava/lang/String;
/* aput-object v4, v3, v0 */
int v0 = 2; // const/4 v0, 0x2
(( com.naef.jnlua.DefaultJavaReflector$InvocableAccessor ) p0 ).getWhat ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/DefaultJavaReflector$InvocableAccessor;->getWhat()Ljava/lang/String;
/* aput-object v4, v3, v0 */
java.lang.String .format ( v2,v3 );
/* invoke-direct {v1, v0}, Lcom/naef/jnlua/LuaRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // .end method
