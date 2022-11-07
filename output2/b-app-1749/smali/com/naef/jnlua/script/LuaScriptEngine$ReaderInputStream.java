class com.naef.jnlua.script.LuaScriptEngine$ReaderInputStream extends java.io.InputStream {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/script/LuaScriptEngine; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "ReaderInputStream" */
} // .end annotation
/* # static fields */
private static final java.nio.charset.Charset UTF8;
/* # instance fields */
private java.nio.ByteBuffer byteBuffer;
private java.nio.CharBuffer charBuffer;
private java.nio.charset.CharsetEncoder encoder;
private Boolean flushed;
private java.io.Reader reader;
/* # direct methods */
static com.naef.jnlua.script.LuaScriptEngine$ReaderInputStream ( ) {
/* .locals 1 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
java.nio.charset.Charset .forName ( v0 );
return;
} // .end method
public com.naef.jnlua.script.LuaScriptEngine$ReaderInputStream ( ) {
/* .locals 3 */
/* const/16 v2, 0x400 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0}, Ljava/io/InputStream;-><init>()V */
java.nio.CharBuffer .allocate ( v2 );
this.charBuffer = v0;
java.nio.ByteBuffer .allocate ( v2 );
this.byteBuffer = v0;
this.reader = p1;
v0 = com.naef.jnlua.script.LuaScriptEngine$ReaderInputStream.UTF8;
(( java.nio.charset.Charset ) v0 ).newEncoder ( ); // invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;
this.encoder = v0;
v0 = this.charBuffer;
(( java.nio.CharBuffer ) v0 ).limit ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/CharBuffer;->limit(I)Ljava/nio/Buffer;
v0 = this.byteBuffer;
(( java.nio.ByteBuffer ) v0 ).limit ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;
return;
} // .end method
/* # virtual methods */
public Integer read ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v3 = 1; // const/4 v3, 0x1
v0 = this.byteBuffer;
v0 = (( java.nio.ByteBuffer ) v0 ).hasRemaining ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z
/* if-nez v0, :cond_5 */
v0 = this.charBuffer;
v0 = (( java.nio.CharBuffer ) v0 ).hasRemaining ( ); // invoke-virtual {v0}, Ljava/nio/CharBuffer;->hasRemaining()Z
/* if-nez v0, :cond_0 */
v0 = this.charBuffer;
(( java.nio.CharBuffer ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;
v0 = this.reader;
v1 = this.charBuffer;
(( java.io.Reader ) v0 ).read ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/Reader;->read(Ljava/nio/CharBuffer;)I
v0 = this.charBuffer;
(( java.nio.CharBuffer ) v0 ).flip ( ); // invoke-virtual {v0}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;
} // :cond_0
v0 = this.byteBuffer;
(( java.nio.ByteBuffer ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
v0 = this.charBuffer;
v0 = (( java.nio.CharBuffer ) v0 ).hasRemaining ( ); // invoke-virtual {v0}, Ljava/nio/CharBuffer;->hasRemaining()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.encoder;
v1 = this.charBuffer;
v2 = this.byteBuffer;
int v3 = 0; // const/4 v3, 0x0
(( java.nio.charset.CharsetEncoder ) v0 ).encode ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;Z)Ljava/nio/charset/CoderResult;
v0 = (( java.nio.charset.CoderResult ) v0 ).isError ( ); // invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isError()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Encoding error"; // const-string v1, "Encoding error"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/naef/jnlua/script/LuaScriptEngine$ReaderInputStream;->flushed:Z */
/* if-nez v0, :cond_4 */
v0 = this.encoder;
v1 = this.charBuffer;
v2 = this.byteBuffer;
(( java.nio.charset.CharsetEncoder ) v0 ).encode ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;Z)Ljava/nio/charset/CoderResult;
v0 = (( java.nio.charset.CoderResult ) v0 ).isError ( ); // invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isError()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Encoding error"; // const-string v1, "Encoding error"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
v0 = this.encoder;
v1 = this.byteBuffer;
(( java.nio.charset.CharsetEncoder ) v0 ).flush ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetEncoder;->flush(Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;
v0 = (( java.nio.charset.CoderResult ) v0 ).isError ( ); // invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isError()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Encoding error"; // const-string v1, "Encoding error"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_3
/* iput-boolean v3, p0, Lcom/naef/jnlua/script/LuaScriptEngine$ReaderInputStream;->flushed:Z */
} // :cond_4
v0 = this.byteBuffer;
(( java.nio.ByteBuffer ) v0 ).flip ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;
v0 = this.byteBuffer;
v0 = (( java.nio.ByteBuffer ) v0 ).hasRemaining ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z
/* if-nez v0, :cond_5 */
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
} // :cond_5
v0 = this.byteBuffer;
v0 = (( java.nio.ByteBuffer ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
} // .end method
