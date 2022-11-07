public class com.naef.jnlua.script.LuaScriptEngineFactory implements javax.script.ScriptEngineFactory {
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String ENGINE_NAME;
	 private static final java.util.List EXTENSIONS;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static final java.lang.String LANGUAGE_NAME;
private static final java.util.List MIME_TYPES;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.List NAMES;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.naef.jnlua.script.LuaScriptEngineFactory ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
final String v1 = "lua"; // const-string v1, "lua"
java.util.Collections .unmodifiableList ( v0 );
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
final String v1 = "application/x-lua"; // const-string v1, "application/x-lua"
final String v1 = "text/x-lua"; // const-string v1, "text/x-lua"
java.util.Collections .unmodifiableList ( v0 );
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
final String v1 = "lua"; // const-string v1, "lua"
final String v1 = "Lua"; // const-string v1, "Lua"
final String v1 = "jnlua"; // const-string v1, "jnlua"
final String v1 = "JNLua"; // const-string v1, "JNLua"
java.util.Collections .unmodifiableList ( v0 );
return;
} // .end method
public com.naef.jnlua.script.LuaScriptEngineFactory ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private void quoteString ( java.lang.StringBuffer p0, java.lang.String p1 ) {
/* .locals 3 */
/* const/16 v2, 0x22 */
(( java.lang.StringBuffer ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-ge v0, v1, :cond_0 */
v1 = (( java.lang.String ) p2 ).charAt ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C
/* sparse-switch v1, :sswitch_data_0 */
v1 = (( java.lang.String ) p2 ).charAt ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
/* :sswitch_0 */
final String v1 = "\\a"; // const-string v1, "\\a"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_1 */
final String v1 = "\\b"; // const-string v1, "\\b"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_2 */
final String v1 = "\\f"; // const-string v1, "\\f"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_3 */
final String v1 = "\\n"; // const-string v1, "\\n"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_4 */
final String v1 = "\\r"; // const-string v1, "\\r"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_5 */
final String v1 = "\\t"; // const-string v1, "\\t"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_6 */
final String v1 = "\\v"; // const-string v1, "\\v"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_7 */
final String v1 = "\\\\"; // const-string v1, "\\\\"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_8 */
final String v1 = "\\\""; // const-string v1, "\\\""
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
(( java.lang.StringBuffer ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
return;
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7 -> :sswitch_0 */
/* 0x8 -> :sswitch_1 */
/* 0x9 -> :sswitch_5 */
/* 0xa -> :sswitch_3 */
/* 0xb -> :sswitch_6 */
/* 0xc -> :sswitch_2 */
/* 0xd -> :sswitch_4 */
/* 0x22 -> :sswitch_8 */
/* 0x5c -> :sswitch_7 */
} // .end sparse-switch
} // .end method
/* # virtual methods */
public java.lang.String getEngineName ( ) {
/* .locals 1 */
final String v0 = "JNLua"; // const-string v0, "JNLua"
} // .end method
public java.lang.String getEngineVersion ( ) {
/* .locals 1 */
final String v0 = "0.9"; // const-string v0, "0.9"
} // .end method
public java.util.List getExtensions ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
v0 = com.naef.jnlua.script.LuaScriptEngineFactory.EXTENSIONS;
} // .end method
public java.lang.String getLanguageName ( ) {
/* .locals 1 */
final String v0 = "Lua"; // const-string v0, "Lua"
} // .end method
public java.lang.String getLanguageVersion ( ) {
/* .locals 1 */
v0 = com.naef.jnlua.LuaState.LUA_VERSION;
} // .end method
public java.lang.String getMethodCallSyntax ( java.lang.String p0, java.lang.String p1, java.lang.String...p2 ) {
/* .locals 3 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const/16 v0, 0x3a */
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const/16 v0, 0x28 */
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v2, p3 */
/* if-ge v0, v2, :cond_1 */
/* if-lez v0, :cond_0 */
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
/* aget-object v2, p3, v0 */
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* const/16 v0, 0x29 */
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public java.util.List getMimeTypes ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
v0 = com.naef.jnlua.script.LuaScriptEngineFactory.MIME_TYPES;
} // .end method
public java.util.List getNames ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
v0 = com.naef.jnlua.script.LuaScriptEngineFactory.NAMES;
} // .end method
public java.lang.String getOutputStatement ( java.lang.String p0 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "print("; // const-string v1, "print("
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* invoke-direct {p0, v0, p1}, Lcom/naef/jnlua/script/LuaScriptEngineFactory;->quoteString(Ljava/lang/StringBuffer;Ljava/lang/String;)V */
/* const/16 v1, 0x29 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public java.lang.Object getParameter ( java.lang.String p0 ) {
/* .locals 2 */
final String v0 = "javax.script.engine"; // const-string v0, "javax.script.engine"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.naef.jnlua.script.LuaScriptEngineFactory ) p0 ).getEngineName ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaScriptEngineFactory;->getEngineName()Ljava/lang/String;
} // :goto_0
} // :cond_0
final String v0 = "javax.script.engine_version"; // const-string v0, "javax.script.engine_version"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
(( com.naef.jnlua.script.LuaScriptEngineFactory ) p0 ).getEngineVersion ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaScriptEngineFactory;->getEngineVersion()Ljava/lang/String;
} // :cond_1
final String v0 = "javax.script.name"; // const-string v0, "javax.script.name"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
(( com.naef.jnlua.script.LuaScriptEngineFactory ) p0 ).getNames ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaScriptEngineFactory;->getNames()Ljava/util/List;
int v1 = 0; // const/4 v1, 0x0
} // :cond_2
final String v0 = "javax.script.language"; // const-string v0, "javax.script.language"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
(( com.naef.jnlua.script.LuaScriptEngineFactory ) p0 ).getLanguageName ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaScriptEngineFactory;->getLanguageName()Ljava/lang/String;
} // :cond_3
final String v0 = "javax.script.language_version"; // const-string v0, "javax.script.language_version"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
(( com.naef.jnlua.script.LuaScriptEngineFactory ) p0 ).getLanguageVersion ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/script/LuaScriptEngineFactory;->getLanguageVersion()Ljava/lang/String;
} // :cond_4
final String v0 = "THREADING"; // const-string v0, "THREADING"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = "MULTITHREADED"; // const-string v0, "MULTITHREADED"
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String getProgram ( java.lang.String...p0 ) {
/* .locals 3 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v2, p1 */
/* if-ge v0, v2, :cond_0 */
/* aget-object v2, p1, v0 */
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public javax.script.ScriptEngine getScriptEngine ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/naef/jnlua/script/LuaScriptEngine; */
/* invoke-direct {v0, p0}, Lcom/naef/jnlua/script/LuaScriptEngine;-><init>(Lcom/naef/jnlua/script/LuaScriptEngineFactory;)V */
} // .end method
