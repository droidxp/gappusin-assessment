public class org.codehaus.jackson.JsonFactory {
	 /* .source "JsonFactory.java" */
	 /* # static fields */
	 static final Integer DEFAULT_GENERATOR_FEATURE_FLAGS;
	 static final Integer DEFAULT_PARSER_FEATURE_FLAGS;
	 static final java.lang.ThreadLocal _recyclerRef;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ThreadLocal", */
	 /* "<", */
	 /* "Ljava/lang/ref/SoftReference", */
	 /* "<", */
	 /* "Lorg/codehaus/jackson/util/BufferRecycler;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
protected Integer _generatorFeatures;
protected org.codehaus.jackson.ObjectCodec _objectCodec;
protected Integer _parserFeatures;
protected org.codehaus.jackson.sym.BytesToNameCanonicalizer _rootByteSymbols;
protected org.codehaus.jackson.sym.CharsToNameCanonicalizer _rootCharSymbols;
/* # direct methods */
static org.codehaus.jackson.JsonFactory ( ) {
/* .locals 1 */
/* .prologue */
/* .line 65 */
v0 = org.codehaus.jackson.JsonParser$Feature .collectDefaults ( );
/* .line 71 */
v0 = org.codehaus.jackson.JsonGenerator$Feature .collectDefaults ( );
/* .line 84 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
return;
} // .end method
public org.codehaus.jackson.JsonFactory ( ) {
/* .locals 1 */
/* .prologue */
/* .line 131 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lorg/codehaus/jackson/JsonFactory;-><init>(Lorg/codehaus/jackson/ObjectCodec;)V */
return;
} // .end method
public org.codehaus.jackson.JsonFactory ( ) {
/* .locals 1 */
/* .param p1, "oc" # Lorg/codehaus/jackson/ObjectCodec; */
/* .prologue */
/* .line 133 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 91 */
org.codehaus.jackson.sym.CharsToNameCanonicalizer .createRoot ( );
this._rootCharSymbols = v0;
/* .line 100 */
org.codehaus.jackson.sym.BytesToNameCanonicalizer .createRoot ( );
this._rootByteSymbols = v0;
/* .line 117 */
/* iput v0, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
/* .line 119 */
/* iput v0, p0, Lorg/codehaus/jackson/JsonFactory;->_generatorFeatures:I */
/* .line 133 */
this._objectCodec = p1;
return;
} // .end method
/* # virtual methods */
protected org.codehaus.jackson.io.IOContext _createContext ( java.lang.Object p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "srcRef" # Ljava/lang/Object; */
/* .param p2, "resourceManaged" # Z */
/* .prologue */
/* .line 504 */
/* new-instance v0, Lorg/codehaus/jackson/io/IOContext; */
(( org.codehaus.jackson.JsonFactory ) p0 )._getBufferRecycler ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonFactory;->_getBufferRecycler()Lorg/codehaus/jackson/util/BufferRecycler;
/* invoke-direct {v0, v1, p1, p2}, Lorg/codehaus/jackson/io/IOContext;-><init>(Lorg/codehaus/jackson/util/BufferRecycler;Ljava/lang/Object;Z)V */
} // .end method
protected org.codehaus.jackson.JsonGenerator _createJsonGenerator ( java.io.Writer p0, org.codehaus.jackson.io.IOContext p1 ) {
/* .locals 3 */
/* .param p1, "out" # Ljava/io/Writer; */
/* .param p2, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 537 */
/* new-instance v0, Lorg/codehaus/jackson/impl/WriterBasedGenerator; */
/* iget v1, p0, Lorg/codehaus/jackson/JsonFactory;->_generatorFeatures:I */
v2 = this._objectCodec;
/* invoke-direct {v0, p2, v1, v2, p1}, Lorg/codehaus/jackson/impl/WriterBasedGenerator;-><init>(Lorg/codehaus/jackson/io/IOContext;ILorg/codehaus/jackson/ObjectCodec;Ljava/io/Writer;)V */
} // .end method
protected org.codehaus.jackson.JsonParser _createJsonParser ( java.io.InputStream p0, org.codehaus.jackson.io.IOContext p1 ) {
/* .locals 5 */
/* .param p1, "in" # Ljava/io/InputStream; */
/* .param p2, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 513 */
/* new-instance v0, Lorg/codehaus/jackson/impl/ByteSourceBootstrapper; */
/* invoke-direct {v0, p2, p1}, Lorg/codehaus/jackson/impl/ByteSourceBootstrapper;-><init>(Lorg/codehaus/jackson/io/IOContext;Ljava/io/InputStream;)V */
/* iget v1, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
v2 = this._objectCodec;
v3 = this._rootByteSymbols;
v4 = this._rootCharSymbols;
(( org.codehaus.jackson.impl.ByteSourceBootstrapper ) v0 ).constructParser ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lorg/codehaus/jackson/impl/ByteSourceBootstrapper;->constructParser(ILorg/codehaus/jackson/ObjectCodec;Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;Lorg/codehaus/jackson/sym/CharsToNameCanonicalizer;)Lorg/codehaus/jackson/JsonParser;
} // .end method
protected org.codehaus.jackson.JsonParser _createJsonParser ( java.io.Reader p0, org.codehaus.jackson.io.IOContext p1 ) {
/* .locals 6 */
/* .param p1, "r" # Ljava/io/Reader; */
/* .param p2, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 519 */
/* new-instance v0, Lorg/codehaus/jackson/impl/ReaderBasedParser; */
/* iget v2, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
v4 = this._objectCodec;
v1 = this._rootCharSymbols;
v3 = org.codehaus.jackson.JsonParser$Feature.CANONICALIZE_FIELD_NAMES;
v3 = (( org.codehaus.jackson.JsonFactory ) p0 ).isEnabled ( v3 ); // invoke-virtual {p0, v3}, Lorg/codehaus/jackson/JsonFactory;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
v5 = org.codehaus.jackson.JsonParser$Feature.INTERN_FIELD_NAMES;
v5 = (( org.codehaus.jackson.JsonFactory ) p0 ).isEnabled ( v5 ); // invoke-virtual {p0, v5}, Lorg/codehaus/jackson/JsonFactory;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
(( org.codehaus.jackson.sym.CharsToNameCanonicalizer ) v1 ).makeChild ( v3, v5 ); // invoke-virtual {v1, v3, v5}, Lorg/codehaus/jackson/sym/CharsToNameCanonicalizer;->makeChild(ZZ)Lorg/codehaus/jackson/sym/CharsToNameCanonicalizer;
/* move-object v1, p2 */
/* move-object v3, p1 */
/* invoke-direct/range {v0 ..v5}, Lorg/codehaus/jackson/impl/ReaderBasedParser;-><init>(Lorg/codehaus/jackson/io/IOContext;ILjava/io/Reader;Lorg/codehaus/jackson/ObjectCodec;Lorg/codehaus/jackson/sym/CharsToNameCanonicalizer;)V */
} // .end method
protected org.codehaus.jackson.JsonParser _createJsonParser ( Object[] p0, Integer p1, Integer p2, org.codehaus.jackson.io.IOContext p3 ) {
/* .locals 5 */
/* .param p1, "data" # [B */
/* .param p2, "offset" # I */
/* .param p3, "len" # I */
/* .param p4, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 528 */
/* new-instance v0, Lorg/codehaus/jackson/impl/ByteSourceBootstrapper; */
/* invoke-direct {v0, p4, p1, p2, p3}, Lorg/codehaus/jackson/impl/ByteSourceBootstrapper;-><init>(Lorg/codehaus/jackson/io/IOContext;[BII)V */
/* iget v1, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
v2 = this._objectCodec;
v3 = this._rootByteSymbols;
v4 = this._rootCharSymbols;
(( org.codehaus.jackson.impl.ByteSourceBootstrapper ) v0 ).constructParser ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lorg/codehaus/jackson/impl/ByteSourceBootstrapper;->constructParser(ILorg/codehaus/jackson/ObjectCodec;Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;Lorg/codehaus/jackson/sym/CharsToNameCanonicalizer;)Lorg/codehaus/jackson/JsonParser;
} // .end method
protected java.io.Writer _createWriter ( java.io.OutputStream p0, org.codehaus.jackson.JsonEncoding p1, org.codehaus.jackson.io.IOContext p2 ) {
/* .locals 2 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .param p2, "enc" # Lorg/codehaus/jackson/JsonEncoding; */
/* .param p3, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 585 */
v0 = org.codehaus.jackson.JsonEncoding.UTF8;
/* if-ne p2, v0, :cond_0 */
/* .line 586 */
/* new-instance v0, Lorg/codehaus/jackson/io/UTF8Writer; */
/* invoke-direct {v0, p3, p1}, Lorg/codehaus/jackson/io/UTF8Writer;-><init>(Lorg/codehaus/jackson/io/IOContext;Ljava/io/OutputStream;)V */
/* .line 589 */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/io/OutputStreamWriter; */
(( org.codehaus.jackson.JsonEncoding ) p2 ).getJavaName ( ); // invoke-virtual {p2}, Lorg/codehaus/jackson/JsonEncoding;->getJavaName()Ljava/lang/String;
/* invoke-direct {v0, p1, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V */
} // .end method
public org.codehaus.jackson.util.BufferRecycler _getBufferRecycler ( ) {
/* .locals 4 */
/* .prologue */
/* .line 548 */
v2 = org.codehaus.jackson.JsonFactory._recyclerRef;
(( java.lang.ThreadLocal ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v1, Ljava/lang/ref/SoftReference; */
/* .line 549 */
/* .local v1, "ref":Ljava/lang/ref/SoftReference;, "Ljava/lang/ref/SoftReference<Lorg/codehaus/jackson/util/BufferRecycler;>;" */
/* if-nez v1, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 551 */
/* .local v0, "br":Lorg/codehaus/jackson/util/BufferRecycler; */
} // :goto_0
/* if-nez v0, :cond_0 */
/* .line 552 */
/* new-instance v0, Lorg/codehaus/jackson/util/BufferRecycler; */
} // .end local v0 # "br":Lorg/codehaus/jackson/util/BufferRecycler;
/* invoke-direct {v0}, Lorg/codehaus/jackson/util/BufferRecycler;-><init>()V */
/* .line 553 */
/* .restart local v0 # "br":Lorg/codehaus/jackson/util/BufferRecycler; */
/* if-nez v1, :cond_0 */
/* .line 554 */
v2 = org.codehaus.jackson.JsonFactory._recyclerRef;
/* new-instance v3, Ljava/lang/ref/SoftReference; */
/* invoke-direct {v3, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V */
(( java.lang.ThreadLocal ) v2 ).set ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
/* .line 557 */
} // :cond_0
/* .line 549 */
} // .end local v0 # "br":Lorg/codehaus/jackson/util/BufferRecycler;
} // :cond_1
(( java.lang.ref.SoftReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;
/* check-cast v2, Lorg/codehaus/jackson/util/BufferRecycler; */
/* move-object v0, v2 */
} // .end method
protected java.io.InputStream _optimizedStreamFromURL ( java.net.URL p0 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/net/URL; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 568 */
final String v1 = "file"; // const-string v1, "file"
(( java.net.URL ) p1 ).getProtocol ( ); // invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 575 */
(( java.net.URL ) p1 ).getHost ( ); // invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;
/* .line 576 */
/* .local v0, "host":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-nez v1, :cond_1 */
/* .line 577 */
} // :cond_0
/* new-instance v1, Ljava/io/FileInputStream; */
(( java.net.URL ) p1 ).getPath ( ); // invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* .line 580 */
} // .end local v0 # "host":Ljava/lang/String;
} // :goto_0
} // :cond_1
(( java.net.URL ) p1 ).openStream ( ); // invoke-virtual {p1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;
} // .end method
public final org.codehaus.jackson.JsonFactory configure ( org.codehaus.jackson.JsonGenerator$Feature p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .param p2, "state" # Z */
/* .prologue */
/* .line 231 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 232 */
(( org.codehaus.jackson.JsonFactory ) p0 ).enable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->enable(Lorg/codehaus/jackson/JsonGenerator$Feature;)Lorg/codehaus/jackson/JsonFactory;
/* .line 236 */
} // :goto_0
/* .line 234 */
} // :cond_0
(( org.codehaus.jackson.JsonFactory ) p0 ).disable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->disable(Lorg/codehaus/jackson/JsonGenerator$Feature;)Lorg/codehaus/jackson/JsonFactory;
} // .end method
public final org.codehaus.jackson.JsonFactory configure ( org.codehaus.jackson.JsonParser$Feature p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .param p2, "state" # Z */
/* .prologue */
/* .line 149 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 150 */
(( org.codehaus.jackson.JsonFactory ) p0 ).enable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->enable(Lorg/codehaus/jackson/JsonParser$Feature;)Lorg/codehaus/jackson/JsonFactory;
/* .line 154 */
} // :goto_0
/* .line 152 */
} // :cond_0
(( org.codehaus.jackson.JsonFactory ) p0 ).disable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->disable(Lorg/codehaus/jackson/JsonParser$Feature;)Lorg/codehaus/jackson/JsonFactory;
} // .end method
public org.codehaus.jackson.JsonGenerator createJsonGenerator ( java.io.File p0, org.codehaus.jackson.JsonEncoding p1 ) {
/* .locals 3 */
/* .param p1, "f" # Ljava/io/File; */
/* .param p2, "enc" # Lorg/codehaus/jackson/JsonEncoding; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 486 */
/* new-instance v1, Ljava/io/FileOutputStream; */
/* invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 488 */
/* .local v1, "out":Ljava/io/OutputStream; */
int v2 = 1; // const/4 v2, 0x1
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
/* .line 489 */
/* .local v0, "ctxt":Lorg/codehaus/jackson/io/IOContext; */
(( org.codehaus.jackson.io.IOContext ) v0 ).setEncoding ( p2 ); // invoke-virtual {v0, p2}, Lorg/codehaus/jackson/io/IOContext;->setEncoding(Lorg/codehaus/jackson/JsonEncoding;)V
/* .line 490 */
(( org.codehaus.jackson.JsonFactory ) p0 )._createWriter ( v1, p2, v0 ); // invoke-virtual {p0, v1, p2, v0}, Lorg/codehaus/jackson/JsonFactory;->_createWriter(Ljava/io/OutputStream;Lorg/codehaus/jackson/JsonEncoding;Lorg/codehaus/jackson/io/IOContext;)Ljava/io/Writer;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonGenerator ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lorg/codehaus/jackson/JsonFactory;->_createJsonGenerator(Ljava/io/Writer;Lorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonGenerator;
} // .end method
public org.codehaus.jackson.JsonGenerator createJsonGenerator ( java.io.OutputStream p0, org.codehaus.jackson.JsonEncoding p1 ) {
/* .locals 2 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .param p2, "enc" # Lorg/codehaus/jackson/JsonEncoding; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 444 */
int v1 = 0; // const/4 v1, 0x0
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
/* .line 445 */
/* .local v0, "ctxt":Lorg/codehaus/jackson/io/IOContext; */
(( org.codehaus.jackson.io.IOContext ) v0 ).setEncoding ( p2 ); // invoke-virtual {v0, p2}, Lorg/codehaus/jackson/io/IOContext;->setEncoding(Lorg/codehaus/jackson/JsonEncoding;)V
/* .line 446 */
(( org.codehaus.jackson.JsonFactory ) p0 )._createWriter ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/codehaus/jackson/JsonFactory;->_createWriter(Ljava/io/OutputStream;Lorg/codehaus/jackson/JsonEncoding;Lorg/codehaus/jackson/io/IOContext;)Ljava/io/Writer;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonGenerator ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lorg/codehaus/jackson/JsonFactory;->_createJsonGenerator(Ljava/io/Writer;Lorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonGenerator;
} // .end method
public org.codehaus.jackson.JsonGenerator createJsonGenerator ( java.io.Writer p0 ) {
/* .locals 2 */
/* .param p1, "out" # Ljava/io/Writer; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 465 */
int v1 = 0; // const/4 v1, 0x0
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
/* .line 466 */
/* .local v0, "ctxt":Lorg/codehaus/jackson/io/IOContext; */
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonGenerator ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/codehaus/jackson/JsonFactory;->_createJsonGenerator(Ljava/io/Writer;Lorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonGenerator;
} // .end method
public org.codehaus.jackson.JsonParser createJsonParser ( java.io.File p0 ) {
/* .locals 2 */
/* .param p1, "f" # Ljava/io/File; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 335 */
/* new-instance v0, Ljava/io/FileInputStream; */
/* invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
int v1 = 1; // const/4 v1, 0x1
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonParser ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/JsonFactory;->_createJsonParser(Ljava/io/InputStream;Lorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonParser;
} // .end method
public org.codehaus.jackson.JsonParser createJsonParser ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p1, "in" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 375 */
int v0 = 0; // const/4 v0, 0x0
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonParser ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/codehaus/jackson/JsonFactory;->_createJsonParser(Ljava/io/InputStream;Lorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonParser;
} // .end method
public org.codehaus.jackson.JsonParser createJsonParser ( java.io.Reader p0 ) {
/* .locals 1 */
/* .param p1, "r" # Ljava/io/Reader; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 394 */
int v0 = 0; // const/4 v0, 0x0
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonParser ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/codehaus/jackson/JsonFactory;->_createJsonParser(Ljava/io/Reader;Lorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonParser;
} // .end method
public org.codehaus.jackson.JsonParser createJsonParser ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "content" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 413 */
/* new-instance v0, Ljava/io/StringReader; */
/* invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V */
/* .line 414 */
/* .local v0, "r":Ljava/io/Reader; */
int v1 = 1; // const/4 v1, 0x1
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonParser ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/JsonFactory;->_createJsonParser(Ljava/io/Reader;Lorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonParser;
} // .end method
public org.codehaus.jackson.JsonParser createJsonParser ( java.net.URL p0 ) {
/* .locals 2 */
/* .param p1, "url" # Ljava/net/URL; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 354 */
(( org.codehaus.jackson.JsonFactory ) p0 )._optimizedStreamFromURL ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->_optimizedStreamFromURL(Ljava/net/URL;)Ljava/io/InputStream;
int v1 = 1; // const/4 v1, 0x1
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonParser ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/JsonFactory;->_createJsonParser(Ljava/io/InputStream;Lorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonParser;
} // .end method
public org.codehaus.jackson.JsonParser createJsonParser ( Object[] p0 ) {
/* .locals 3 */
/* .param p1, "data" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 400 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p1 */
int v2 = 1; // const/4 v2, 0x1
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonParser ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Lorg/codehaus/jackson/JsonFactory;->_createJsonParser([BIILorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonParser;
} // .end method
public org.codehaus.jackson.JsonParser createJsonParser ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "data" # [B */
/* .param p2, "offset" # I */
/* .param p3, "len" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 406 */
int v0 = 1; // const/4 v0, 0x1
(( org.codehaus.jackson.JsonFactory ) p0 )._createContext ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/codehaus/jackson/JsonFactory;->_createContext(Ljava/lang/Object;Z)Lorg/codehaus/jackson/io/IOContext;
(( org.codehaus.jackson.JsonFactory ) p0 )._createJsonParser ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/codehaus/jackson/JsonFactory;->_createJsonParser([BIILorg/codehaus/jackson/io/IOContext;)Lorg/codehaus/jackson/JsonParser;
} // .end method
public org.codehaus.jackson.JsonFactory disable ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 258 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonFactory;->_generatorFeatures:I */
v1 = (( org.codehaus.jackson.JsonGenerator$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator$Feature;->getMask()I
/* xor-int/lit8 v1, v1, -0x1 */
/* and-int/2addr v0, v1 */
/* iput v0, p0, Lorg/codehaus/jackson/JsonFactory;->_generatorFeatures:I */
/* .line 259 */
} // .end method
public org.codehaus.jackson.JsonFactory disable ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 175 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
v1 = (( org.codehaus.jackson.JsonParser$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser$Feature;->getMask()I
/* xor-int/lit8 v1, v1, -0x1 */
/* and-int/2addr v0, v1 */
/* iput v0, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
/* .line 176 */
} // .end method
public final void disableGeneratorFeature ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 284 */
(( org.codehaus.jackson.JsonFactory ) p0 ).disable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->disable(Lorg/codehaus/jackson/JsonGenerator$Feature;)Lorg/codehaus/jackson/JsonFactory;
/* .line 285 */
return;
} // .end method
public final void disableParserFeature ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 201 */
(( org.codehaus.jackson.JsonFactory ) p0 ).disable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->disable(Lorg/codehaus/jackson/JsonParser$Feature;)Lorg/codehaus/jackson/JsonFactory;
/* .line 202 */
return;
} // .end method
public org.codehaus.jackson.JsonFactory enable ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 247 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonFactory;->_generatorFeatures:I */
v1 = (( org.codehaus.jackson.JsonGenerator$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator$Feature;->getMask()I
/* or-int/2addr v0, v1 */
/* iput v0, p0, Lorg/codehaus/jackson/JsonFactory;->_generatorFeatures:I */
/* .line 248 */
} // .end method
public org.codehaus.jackson.JsonFactory enable ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 164 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
v1 = (( org.codehaus.jackson.JsonParser$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser$Feature;->getMask()I
/* or-int/2addr v0, v1 */
/* iput v0, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
/* .line 165 */
} // .end method
public final void enableGeneratorFeature ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 277 */
(( org.codehaus.jackson.JsonFactory ) p0 ).enable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->enable(Lorg/codehaus/jackson/JsonGenerator$Feature;)Lorg/codehaus/jackson/JsonFactory;
/* .line 278 */
return;
} // .end method
public final void enableParserFeature ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 194 */
(( org.codehaus.jackson.JsonFactory ) p0 ).enable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->enable(Lorg/codehaus/jackson/JsonParser$Feature;)Lorg/codehaus/jackson/JsonFactory;
/* .line 195 */
return;
} // .end method
public org.codehaus.jackson.ObjectCodec getCodec ( ) {
/* .locals 1 */
/* .prologue */
/* .line 312 */
v0 = this._objectCodec;
} // .end method
public final Boolean isEnabled ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 268 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonFactory;->_generatorFeatures:I */
v1 = (( org.codehaus.jackson.JsonGenerator$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator$Feature;->getMask()I
/* and-int/2addr v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean isEnabled ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 185 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
v1 = (( org.codehaus.jackson.JsonParser$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser$Feature;->getMask()I
/* and-int/2addr v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean isGeneratorFeatureEnabled ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 1 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 298 */
v0 = (( org.codehaus.jackson.JsonFactory ) p0 ).isEnabled ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonFactory;->isEnabled(Lorg/codehaus/jackson/JsonGenerator$Feature;)Z
} // .end method
public final Boolean isParserFeatureEnabled ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 215 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonFactory;->_parserFeatures:I */
v1 = (( org.codehaus.jackson.JsonParser$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser$Feature;->getMask()I
/* and-int/2addr v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.codehaus.jackson.JsonFactory setCodec ( org.codehaus.jackson.ObjectCodec p0 ) {
/* .locals 0 */
/* .param p1, "oc" # Lorg/codehaus/jackson/ObjectCodec; */
/* .prologue */
/* .line 308 */
this._objectCodec = p1;
/* .line 309 */
} // .end method
public final void setGeneratorFeature ( org.codehaus.jackson.JsonGenerator$Feature p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .param p2, "state" # Z */
/* .prologue */
/* .line 291 */
(( org.codehaus.jackson.JsonFactory ) p0 ).configure ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/codehaus/jackson/JsonFactory;->configure(Lorg/codehaus/jackson/JsonGenerator$Feature;Z)Lorg/codehaus/jackson/JsonFactory;
/* .line 292 */
return;
} // .end method
public final void setParserFeature ( org.codehaus.jackson.JsonParser$Feature p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .param p2, "state" # Z */
/* .prologue */
/* .line 208 */
(( org.codehaus.jackson.JsonFactory ) p0 ).configure ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/codehaus/jackson/JsonFactory;->configure(Lorg/codehaus/jackson/JsonParser$Feature;Z)Lorg/codehaus/jackson/JsonFactory;
/* .line 209 */
return;
} // .end method
