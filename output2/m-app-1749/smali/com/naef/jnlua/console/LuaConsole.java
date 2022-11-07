public class com.naef.jnlua.console.LuaConsole {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/naef/jnlua/console/LuaConsole$1; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String EMPTY_ARGS;
/* # instance fields */
private com.naef.jnlua.LuaState luaState;
/* # direct methods */
static com.naef.jnlua.console.LuaConsole ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [Ljava/lang/String; */
	 return;
} // .end method
public com.naef.jnlua.console.LuaConsole ( ) {
	 /* .locals 1 */
	 v0 = com.naef.jnlua.console.LuaConsole.EMPTY_ARGS;
	 /* invoke-direct {p0, v0}, Lcom/naef/jnlua/console/LuaConsole;-><init>([Ljava/lang/String;)V */
	 return;
} // .end method
public com.naef.jnlua.console.LuaConsole ( ) {
	 /* .locals 5 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* new-instance v0, Lcom/naef/jnlua/LuaState; */
	 /* invoke-direct {v0}, Lcom/naef/jnlua/LuaState;-><init>()V */
	 this.luaState = v0;
	 v0 = this.luaState;
	 /* array-length v2, p1 */
	 (( com.naef.jnlua.LuaState ) v0 ).newTable ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lcom/naef/jnlua/LuaState;->newTable(II)V
	 /* move v0, v1 */
} // :goto_0
/* array-length v2, p1 */
/* if-ge v0, v2, :cond_0 */
v2 = this.luaState;
/* aget-object v3, p1, v0 */
(( com.naef.jnlua.LuaState ) v2 ).pushString ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/LuaState;->pushString(Ljava/lang/String;)V
v2 = this.luaState;
int v3 = -2; // const/4 v3, -0x2
/* add-int/lit8 v4, v0, 0x1 */
(( com.naef.jnlua.LuaState ) v2 ).rawSet ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/naef/jnlua/LuaState;->rawSet(II)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v0 = this.luaState;
final String v2 = "argv"; // const-string v2, "argv"
(( com.naef.jnlua.LuaState ) v0 ).setGlobal ( v2 ); // invoke-virtual {v0, v2}, Lcom/naef/jnlua/LuaState;->setGlobal(Ljava/lang/String;)V
v0 = this.luaState;
(( com.naef.jnlua.LuaState ) v0 ).openLibs ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaState;->openLibs()V
v0 = this.luaState;
final String v2 = "io.stdout:setvbuf(\"no\")"; // const-string v2, "io.stdout:setvbuf(\"no\")"
final String v3 = "setvbuf"; // const-string v3, "setvbuf"
(( com.naef.jnlua.LuaState ) v0 ).load ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/naef/jnlua/LuaState;->load(Ljava/lang/String;Ljava/lang/String;)V
v0 = this.luaState;
(( com.naef.jnlua.LuaState ) v0 ).call ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Lcom/naef/jnlua/LuaState;->call(II)V
v0 = this.luaState;
final String v2 = "io.stderr:setvbuf(\"no\")"; // const-string v2, "io.stderr:setvbuf(\"no\")"
final String v3 = "setvbuf"; // const-string v3, "setvbuf"
(( com.naef.jnlua.LuaState ) v0 ).load ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/naef/jnlua/LuaState;->load(Ljava/lang/String;Ljava/lang/String;)V
v0 = this.luaState;
(( com.naef.jnlua.LuaState ) v0 ).call ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Lcom/naef/jnlua/LuaState;->call(II)V
return;
} // .end method
public static void main ( java.lang.String[] p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/naef/jnlua/console/LuaConsole; */
/* invoke-direct {v0, p0}, Lcom/naef/jnlua/console/LuaConsole;-><init>([Ljava/lang/String;)V */
(( com.naef.jnlua.console.LuaConsole ) v0 ).run ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/console/LuaConsole;->run()V
int v0 = 0; // const/4 v0, 0x0
java.lang.System .exit ( v0 );
return;
} // .end method
/* # virtual methods */
public com.naef.jnlua.LuaState getLuaState ( ) {
/* .locals 1 */
v0 = this.luaState;
} // .end method
public void run ( ) {
/* .locals 8 */
int v2 = 0; // const/4 v2, 0x0
int v1 = 1; // const/4 v1, 0x1
v0 = java.lang.System.out;
final String v3 = "JNLua %s Console using Lua %s."; // const-string v3, "JNLua %s Console using Lua %s."
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [Ljava/lang/Object; */
final String v5 = "0.9"; // const-string v5, "0.9"
/* aput-object v5, v4, v2 */
v5 = com.naef.jnlua.LuaState.LUA_VERSION;
/* aput-object v5, v4, v1 */
java.lang.String .format ( v3,v4 );
(( java.io.PrintStream ) v0 ).println ( v3 ); // invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v0 = java.lang.System.out;
final String v3 = "Type \'go\' on an empty line to evaluate a chunk."; // const-string v3, "Type \'go\' on an empty line to evaluate a chunk."
(( java.io.PrintStream ) v0 ).print ( v3 ); // invoke-virtual {v0, v3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
v0 = java.lang.System.out;
final String v3 = "Type =<expression> to print an expression."; // const-string v3, "Type =<expression> to print an expression."
(( java.io.PrintStream ) v0 ).println ( v3 ); // invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* new-instance v3, Ljava/io/BufferedReader; */
/* new-instance v0, Ljava/io/InputStreamReader; */
v4 = java.lang.System.in;
/* invoke-direct {v0, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
/* invoke-direct {v3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
} // :goto_0
try { // :try_start_0
/* new-instance v4, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v5, Ljava/io/OutputStreamWriter; */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
/* invoke-direct {v5, v4, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V */
/* move v0, v1 */
} // :goto_1
(( java.io.BufferedReader ) v3 ).readLine ( ); // invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* if-nez v6, :cond_0 */
} // :goto_2
return;
} // :cond_0
final String v7 = "go"; // const-string v7, "go"
v7 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_1
(( java.io.OutputStreamWriter ) v5 ).flush ( ); // invoke-virtual {v5}, Ljava/io/OutputStreamWriter;->flush()V
/* new-instance v0, Ljava/io/ByteArrayInputStream; */
(( java.io.ByteArrayOutputStream ) v4 ).toByteArray ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* invoke-direct {v0, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
(( com.naef.jnlua.console.LuaConsole ) p0 ).runChunk ( v0 ); // invoke-virtual {p0, v0}, Lcom/naef/jnlua/console/LuaConsole;->runChunk(Ljava/io/InputStream;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
v1 = java.lang.System.out;
final String v2 = "IO error: "; // const-string v2, "IO error: "
(( java.io.PrintStream ) v1 ).print ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
v1 = java.lang.System.out;
(( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).print ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).println ( ); // invoke-virtual {v0}, Ljava/io/PrintStream;->println()V
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
try { // :try_start_1
final String v0 = "="; // const-string v0, "="
v0 = (( java.lang.String ) v6 ).startsWith ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "return "; // const-string v7, "return "
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v7 = 1; // const/4 v7, 0x1
(( java.lang.String ) v6 ).substring ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.OutputStreamWriter ) v5 ).write ( v0 ); // invoke-virtual {v5, v0}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
(( java.io.OutputStreamWriter ) v5 ).flush ( ); // invoke-virtual {v5}, Ljava/io/OutputStreamWriter;->flush()V
/* new-instance v0, Ljava/io/ByteArrayInputStream; */
(( java.io.ByteArrayOutputStream ) v4 ).toByteArray ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* invoke-direct {v0, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
(( com.naef.jnlua.console.LuaConsole ) p0 ).runChunk ( v0 ); // invoke-virtual {p0, v0}, Lcom/naef/jnlua/console/LuaConsole;->runChunk(Ljava/io/InputStream;)V
} // :cond_2
(( java.io.OutputStreamWriter ) v5 ).write ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
/* const/16 v0, 0xa */
(( java.io.OutputStreamWriter ) v5 ).write ( v0 ); // invoke-virtual {v5, v0}, Ljava/io/OutputStreamWriter;->write(I)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* move v0, v2 */
} // .end method
protected void runChunk ( java.io.InputStream p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v1 = 1; // const/4 v1, 0x1
try { // :try_start_0
java.lang.System .nanoTime ( );
/* move-result-wide v2 */
v0 = this.luaState;
int v4 = 0; // const/4 v4, 0x0
(( com.naef.jnlua.LuaState ) v0 ).setTop ( v4 ); // invoke-virtual {v0, v4}, Lcom/naef/jnlua/LuaState;->setTop(I)V
v0 = this.luaState;
final String v4 = "console"; // const-string v4, "console"
(( com.naef.jnlua.LuaState ) v0 ).load ( p1, v4 ); // invoke-virtual {v0, p1, v4}, Lcom/naef/jnlua/LuaState;->load(Ljava/io/InputStream;Ljava/lang/String;)V
v0 = this.luaState;
int v4 = 0; // const/4 v4, 0x0
int v5 = -1; // const/4 v5, -0x1
(( com.naef.jnlua.LuaState ) v0 ).call ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Lcom/naef/jnlua/LuaState;->call(II)V
java.lang.System .nanoTime ( );
/* move-result-wide v4 */
/* move v0, v1 */
} // :goto_0
v6 = this.luaState;
v6 = (( com.naef.jnlua.LuaState ) v6 ).getTop ( ); // invoke-virtual {v6}, Lcom/naef/jnlua/LuaState;->getTop()I
/* if-gt v0, v6, :cond_1 */
/* if-le v0, v1, :cond_0 */
v6 = java.lang.System.out;
final String v7 = ", "; // const-string v7, ", "
(( java.io.PrintStream ) v6 ).print ( v7 ); // invoke-virtual {v6, v7}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
} // :cond_0
v6 = com.naef.jnlua.console.LuaConsole$1.$SwitchMap$com$naef$jnlua$LuaType;
v7 = this.luaState;
(( com.naef.jnlua.LuaState ) v7 ).type ( v0 ); // invoke-virtual {v7, v0}, Lcom/naef/jnlua/LuaState;->type(I)Lcom/naef/jnlua/LuaType;
v7 = (( com.naef.jnlua.LuaType ) v7 ).ordinal ( ); // invoke-virtual {v7}, Lcom/naef/jnlua/LuaType;->ordinal()I
/* aget v6, v6, v7 */
/* packed-switch v6, :pswitch_data_0 */
v6 = java.lang.System.out;
v7 = this.luaState;
(( com.naef.jnlua.LuaState ) v7 ).typeName ( v0 ); // invoke-virtual {v7, v0}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
(( java.io.PrintStream ) v6 ).print ( v7 ); // invoke-virtual {v6, v7}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
/* :pswitch_0 */
v6 = java.lang.System.out;
v7 = this.luaState;
v7 = (( com.naef.jnlua.LuaState ) v7 ).toBoolean ( v0 ); // invoke-virtual {v7, v0}, Lcom/naef/jnlua/LuaState;->toBoolean(I)Z
java.lang.Boolean .valueOf ( v7 );
(( java.io.PrintStream ) v6 ).print ( v7 ); // invoke-virtual {v6, v7}, Ljava/io/PrintStream;->print(Ljava/lang/Object;)V
/* :try_end_0 */
/* .catch Lcom/naef/jnlua/LuaRuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Lcom/naef/jnlua/LuaException; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
(( com.naef.jnlua.LuaRuntimeException ) v0 ).printLuaStackTrace ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaRuntimeException;->printLuaStackTrace()V
(( com.naef.jnlua.LuaRuntimeException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaRuntimeException;->printStackTrace()V
} // :goto_2
return;
/* :pswitch_1 */
try { // :try_start_1
v6 = java.lang.System.out;
v7 = this.luaState;
(( com.naef.jnlua.LuaState ) v7 ).toString ( v0 ); // invoke-virtual {v7, v0}, Lcom/naef/jnlua/LuaState;->toString(I)Ljava/lang/String;
(( java.io.PrintStream ) v6 ).print ( v7 ); // invoke-virtual {v6, v7}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
/* :try_end_1 */
/* .catch Lcom/naef/jnlua/LuaRuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Lcom/naef/jnlua/LuaException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
v1 = java.lang.System.err;
(( com.naef.jnlua.LuaException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaException;->getMessage()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // :cond_1
try { // :try_start_2
v0 = java.lang.System.out;
final String v1 = "\t#msec="; // const-string v1, "\t#msec="
(( java.io.PrintStream ) v0 ).print ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
v0 = java.lang.System.out;
final String v1 = "%.3f"; // const-string v1, "%.3f"
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Object; */
int v7 = 0; // const/4 v7, 0x0
/* sub-long v2, v4, v2 */
/* long-to-double v2, v2 */
/* const-wide v4, 0x412e848000000000L # 1000000.0 */
/* div-double/2addr v2, v4 */
java.lang.Double .valueOf ( v2,v3 );
/* aput-object v2, v6, v7 */
java.lang.String .format ( v1,v6 );
(( java.io.PrintStream ) v0 ).print ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).println ( ); // invoke-virtual {v0}, Ljava/io/PrintStream;->println()V
/* :try_end_2 */
/* .catch Lcom/naef/jnlua/LuaRuntimeException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Lcom/naef/jnlua/LuaException; {:try_start_2 ..:try_end_2} :catch_1 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
