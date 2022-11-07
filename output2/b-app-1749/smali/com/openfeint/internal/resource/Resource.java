public abstract class com.openfeint.internal.resource.Resource {
	 /* .source "Resource.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 private static java.util.HashMap sNameMap;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Lcom/openfeint/internal/resource/ResourceClass;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static java.util.HashMap sSubclassMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<+", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ">;", */
/* "Lcom/openfeint/internal/resource/ResourceClass;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
java.lang.String mID;
/* # direct methods */
static com.openfeint.internal.resource.Resource ( ) {
/* .locals 1 */
/* .prologue */
/* .line 30 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 31 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 166 */
com.openfeint.internal.resource.Resource .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 167 */
com.openfeint.internal.resource.ServerException .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 168 */
com.openfeint.api.resource.ServerTimestamp .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 169 */
com.openfeint.internal.resource.BlobUploadParameters .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 171 */
com.openfeint.api.resource.Achievement .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 172 */
com.openfeint.api.resource.Leaderboard .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 173 */
com.openfeint.api.resource.Score .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 174 */
com.openfeint.api.resource.User .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 177 */
com.openfeint.api.resource.CurrentUser .getResourceClass ( );
com.openfeint.internal.resource.Resource .registerSubclass ( v0 );
/* .line 179 */
return;
} // .end method
public com.openfeint.internal.resource.Resource ( ) {
/* .locals 0 */
/* .prologue */
/* .line 23 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static com.openfeint.internal.resource.ResourceClass getKlass ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Lcom/openfeint/internal/resource/ResourceClass;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 41 */
/* .local p0, "subclass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
v0 = com.openfeint.internal.resource.Resource.sSubclassMap;
(( java.util.HashMap ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/openfeint/internal/resource/ResourceClass; */
} // .end method
public static com.openfeint.internal.resource.ResourceClass getKlass ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "klassName" # Ljava/lang/String; */
/* .prologue */
/* .line 45 */
v0 = com.openfeint.internal.resource.Resource.sNameMap;
(( java.util.HashMap ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/openfeint/internal/resource/ResourceClass; */
} // .end method
public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
/* .locals 4 */
/* .prologue */
/* .line 50 */
/* new-instance v0, Lcom/openfeint/internal/resource/Resource$1; */
/* const-class v1, Lcom/openfeint/internal/resource/Resource; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Lcom/openfeint/internal/resource/Resource$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 51 */
/* .local v0, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
v1 = this.mProperties;
final String v2 = "id"; // const-string v2, "id"
/* new-instance v3, Lcom/openfeint/internal/resource/Resource$2; */
/* invoke-direct {v3}, Lcom/openfeint/internal/resource/Resource$2;-><init>()V */
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 52 */
} // .end method
public static void registerSubclass ( com.openfeint.internal.resource.ResourceClass p0 ) {
/* .locals 2 */
/* .param p0, "klass" # Lcom/openfeint/internal/resource/ResourceClass; */
/* .prologue */
/* .line 34 */
v0 = com.openfeint.internal.resource.Resource.sSubclassMap;
v1 = this.mObjectClass;
(( java.util.HashMap ) v0 ).put ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 35 */
v0 = this.mResourceName;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 36 */
v0 = com.openfeint.internal.resource.Resource.sNameMap;
v1 = this.mResourceName;
(( java.util.HashMap ) v0 ).put ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 38 */
} // :cond_0
return;
} // .end method
private final void unguardedShallowCopy ( com.openfeint.internal.resource.Resource p0 ) {
/* .locals 6 */
/* .param p1, "otherResource" # Lcom/openfeint/internal/resource/Resource; */
/* .prologue */
/* .line 150 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
com.openfeint.internal.resource.Resource .getKlass ( v4 );
/* .line 151 */
/* .local v2, "rc":Lcom/openfeint/internal/resource/ResourceClass; */
v4 = this.mProperties;
(( java.util.HashMap ) v4 ).entrySet ( ); // invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .local v1, "i$":Ljava/util/Iterator; */
} // :cond_0
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_3
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 152 */
/* .local v0, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/openfeint/internal/resource/ResourceProperty;>;" */
/* check-cast v3, Lcom/openfeint/internal/resource/ResourceProperty; */
/* .line 153 */
/* .local v3, "rp":Lcom/openfeint/internal/resource/ResourceProperty; */
/* instance-of v4, v3, Lcom/openfeint/internal/resource/PrimitiveResourceProperty; */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 154 */
/* check-cast v3, Lcom/openfeint/internal/resource/PrimitiveResourceProperty; */
} // .end local v3 # "rp":Lcom/openfeint/internal/resource/ResourceProperty;
(( com.openfeint.internal.resource.PrimitiveResourceProperty ) v3 ).copy ( p0, p1 ); // invoke-virtual {v3, p0, p1}, Lcom/openfeint/internal/resource/PrimitiveResourceProperty;->copy(Lcom/openfeint/internal/resource/Resource;Lcom/openfeint/internal/resource/Resource;)V
/* .line 155 */
/* .restart local v3 # "rp":Lcom/openfeint/internal/resource/ResourceProperty; */
} // :cond_1
/* instance-of v4, v3, Lcom/openfeint/internal/resource/ArrayResourceProperty; */
if ( v4 != null) { // if-eqz v4, :cond_2
/* move-object v4, v3 */
/* .line 156 */
/* check-cast v4, Lcom/openfeint/internal/resource/ArrayResourceProperty; */
/* check-cast v3, Lcom/openfeint/internal/resource/ArrayResourceProperty; */
} // .end local v3 # "rp":Lcom/openfeint/internal/resource/ResourceProperty;
(( com.openfeint.internal.resource.ArrayResourceProperty ) v3 ).get ( p1 ); // invoke-virtual {v3, p1}, Lcom/openfeint/internal/resource/ArrayResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/util/List;
(( com.openfeint.internal.resource.ArrayResourceProperty ) v4 ).set ( p0, v5 ); // invoke-virtual {v4, p0, v5}, Lcom/openfeint/internal/resource/ArrayResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/util/List;)V
/* .line 157 */
/* .restart local v3 # "rp":Lcom/openfeint/internal/resource/ResourceProperty; */
} // :cond_2
/* instance-of v4, v3, Lcom/openfeint/internal/resource/NestedResourceProperty; */
if ( v4 != null) { // if-eqz v4, :cond_0
/* move-object v4, v3 */
/* .line 158 */
/* check-cast v4, Lcom/openfeint/internal/resource/NestedResourceProperty; */
/* check-cast v3, Lcom/openfeint/internal/resource/NestedResourceProperty; */
} // .end local v3 # "rp":Lcom/openfeint/internal/resource/ResourceProperty;
(( com.openfeint.internal.resource.NestedResourceProperty ) v3 ).get ( p1 ); // invoke-virtual {v3, p1}, Lcom/openfeint/internal/resource/NestedResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Lcom/openfeint/internal/resource/Resource;
(( com.openfeint.internal.resource.NestedResourceProperty ) v4 ).set ( p0, v5 ); // invoke-virtual {v4, p0, v5}, Lcom/openfeint/internal/resource/NestedResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Lcom/openfeint/internal/resource/Resource;)V
/* .line 161 */
} // .end local v0 # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/openfeint/internal/resource/ResourceProperty;>;"
} // :cond_3
return;
} // .end method
/* # virtual methods */
public final java.lang.String generate ( ) {
/* .locals 6 */
/* .prologue */
/* .line 63 */
/* new-instance v3, Ljava/io/StringWriter; */
/* invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V */
/* .line 64 */
/* .local v3, "sw":Ljava/io/StringWriter; */
/* new-instance v1, Lorg/codehaus/jackson/JsonFactory; */
/* invoke-direct {v1}, Lorg/codehaus/jackson/JsonFactory;-><init>()V */
/* .line 66 */
/* .local v1, "jf":Lorg/codehaus/jackson/JsonFactory; */
try { // :try_start_0
(( org.codehaus.jackson.JsonFactory ) v1 ).createJsonGenerator ( v3 ); // invoke-virtual {v1, v3}, Lorg/codehaus/jackson/JsonFactory;->createJsonGenerator(Ljava/io/Writer;)Lorg/codehaus/jackson/JsonGenerator;
/* .line 67 */
/* .local v2, "jg":Lorg/codehaus/jackson/JsonGenerator; */
(( com.openfeint.internal.resource.Resource ) p0 ).generate ( v2 ); // invoke-virtual {p0, v2}, Lcom/openfeint/internal/resource/Resource;->generate(Lorg/codehaus/jackson/JsonGenerator;)V
/* .line 68 */
(( org.codehaus.jackson.JsonGenerator ) v2 ).close ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/JsonGenerator;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 73 */
(( java.io.StringWriter ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
} // .end local v2 # "jg":Lorg/codehaus/jackson/JsonGenerator;
} // :goto_0
/* .line 69 */
/* :catch_0 */
/* move-exception v0 */
/* .line 70 */
/* .local v0, "e":Ljava/io/IOException; */
final String v4 = "Resource"; // const-string v4, "Resource"
(( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* .line 71 */
int v4 = 0; // const/4 v4, 0x0
} // .end method
public final void generate ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .locals 13 */
/* .param p1, "generator" # Lorg/codehaus/jackson/JsonGenerator; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonGenerationException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 77 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
com.openfeint.internal.resource.Resource .getKlass ( v11 );
/* .line 78 */
/* .local v8, "rc":Lcom/openfeint/internal/resource/ResourceClass; */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeStartObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeStartObject()V
/* .line 79 */
v11 = this.mResourceName;
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeFieldName ( v11 ); // invoke-virtual {p1, v11}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 80 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeStartObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeStartObject()V
/* .line 81 */
v11 = this.mProperties;
(( java.util.HashMap ) v11 ).entrySet ( ); // invoke-virtual {v11}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
} // :cond_0
v11 = } // :goto_0
if ( v11 != null) { // if-eqz v11, :cond_6
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 82 */
/* .local v1, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/openfeint/internal/resource/ResourceProperty;>;" */
/* check-cast v10, Lcom/openfeint/internal/resource/ResourceProperty; */
/* .line 83 */
/* .local v10, "rp":Lcom/openfeint/internal/resource/ResourceProperty; */
/* instance-of v11, v10, Lcom/openfeint/internal/resource/PrimitiveResourceProperty; */
if ( v11 != null) { // if-eqz v11, :cond_1
/* .line 84 */
/* check-cast v10, Lcom/openfeint/internal/resource/PrimitiveResourceProperty; */
} // .end local v10 # "rp":Lcom/openfeint/internal/resource/ResourceProperty;
/* check-cast v11, Ljava/lang/String; */
(( com.openfeint.internal.resource.PrimitiveResourceProperty ) v10 ).generate ( p0, p1, v11 ); // invoke-virtual {v10, p0, p1, v11}, Lcom/openfeint/internal/resource/PrimitiveResourceProperty;->generate(Lcom/openfeint/internal/resource/Resource;Lorg/codehaus/jackson/JsonGenerator;Ljava/lang/String;)V
/* .line 85 */
/* .restart local v10 # "rp":Lcom/openfeint/internal/resource/ResourceProperty; */
} // :cond_1
/* instance-of v11, v10, Lcom/openfeint/internal/resource/ArrayResourceProperty; */
if ( v11 != null) { // if-eqz v11, :cond_3
/* move-object v0, v10 */
/* .line 86 */
/* check-cast v0, Lcom/openfeint/internal/resource/ArrayResourceProperty; */
/* .line 87 */
/* .local v0, "arp":Lcom/openfeint/internal/resource/ArrayResourceProperty; */
(( com.openfeint.internal.resource.ArrayResourceProperty ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Lcom/openfeint/internal/resource/ArrayResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/util/List;
/* .line 88 */
/* .local v9, "resources":Ljava/util/List;, "Ljava/util/List<+Lcom/openfeint/internal/resource/Resource;>;" */
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 89 */
/* check-cast v11, Ljava/lang/String; */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeFieldName ( v11 ); // invoke-virtual {p1, v11}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 90 */
(( com.openfeint.internal.resource.ArrayResourceProperty ) v0 ).elementType ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/resource/ArrayResourceProperty;->elementType()Ljava/lang/Class;
com.openfeint.internal.resource.Resource .getKlass ( v11 );
/* .line 92 */
/* .local v3, "erc":Lcom/openfeint/internal/resource/ResourceClass; */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeStartObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeStartObject()V
/* .line 93 */
/* new-instance v11, Ljava/lang/StringBuilder; */
/* invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V */
v12 = this.mResourceName;
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v12 = "s"; // const-string v12, "s"
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeFieldName ( v11 ); // invoke-virtual {p1, v11}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 94 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeStartArray ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeStartArray()V
/* .line 96 */
/* .local v5, "i$":Ljava/util/Iterator; */
v11 = } // :goto_1
if ( v11 != null) { // if-eqz v11, :cond_2
/* check-cast v6, Lcom/openfeint/internal/resource/Resource; */
/* .line 97 */
/* .local v6, "r":Lcom/openfeint/internal/resource/Resource; */
(( com.openfeint.internal.resource.Resource ) v6 ).generate ( p1 ); // invoke-virtual {v6, p1}, Lcom/openfeint/internal/resource/Resource;->generate(Lorg/codehaus/jackson/JsonGenerator;)V
/* .line 100 */
} // .end local v6 # "r":Lcom/openfeint/internal/resource/Resource;
} // :cond_2
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeEndArray ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeEndArray()V
/* .line 101 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeEndObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeEndObject()V
/* .line 103 */
} // .end local v0 # "arp":Lcom/openfeint/internal/resource/ArrayResourceProperty;
} // .end local v3 # "erc":Lcom/openfeint/internal/resource/ResourceClass;
} // .end local v5 # "i$":Ljava/util/Iterator;
} // .end local v9 # "resources":Ljava/util/List;, "Ljava/util/List<+Lcom/openfeint/internal/resource/Resource;>;"
} // :cond_3
/* instance-of v11, v10, Lcom/openfeint/internal/resource/NestedResourceProperty; */
if ( v11 != null) { // if-eqz v11, :cond_4
/* .line 104 */
/* check-cast v10, Lcom/openfeint/internal/resource/NestedResourceProperty; */
} // .end local v10 # "rp":Lcom/openfeint/internal/resource/ResourceProperty;
(( com.openfeint.internal.resource.NestedResourceProperty ) v10 ).get ( p0 ); // invoke-virtual {v10, p0}, Lcom/openfeint/internal/resource/NestedResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Lcom/openfeint/internal/resource/Resource;
/* .line 105 */
/* .restart local v6 # "r":Lcom/openfeint/internal/resource/Resource; */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 106 */
/* check-cast v11, Ljava/lang/String; */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeFieldName ( v11 ); // invoke-virtual {p1, v11}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 107 */
(( com.openfeint.internal.resource.Resource ) v6 ).generate ( p1 ); // invoke-virtual {v6, p1}, Lcom/openfeint/internal/resource/Resource;->generate(Lorg/codehaus/jackson/JsonGenerator;)V
/* goto/16 :goto_0 */
/* .line 109 */
} // .end local v6 # "r":Lcom/openfeint/internal/resource/Resource;
/* .restart local v10 # "rp":Lcom/openfeint/internal/resource/ResourceProperty; */
} // :cond_4
/* instance-of v11, v10, Lcom/openfeint/internal/resource/HashIntResourceProperty; */
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 110 */
/* check-cast v10, Lcom/openfeint/internal/resource/HashIntResourceProperty; */
} // .end local v10 # "rp":Lcom/openfeint/internal/resource/ResourceProperty;
(( com.openfeint.internal.resource.HashIntResourceProperty ) v10 ).get ( p0 ); // invoke-virtual {v10, p0}, Lcom/openfeint/internal/resource/HashIntResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/util/HashMap;
/* .line 111 */
/* .local v7, "r":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;" */
if ( v7 != null) { // if-eqz v7, :cond_0
v11 = (( java.util.HashMap ) v7 ).size ( ); // invoke-virtual {v7}, Ljava/util/HashMap;->size()I
/* if-lez v11, :cond_0 */
/* .line 112 */
/* check-cast v11, Ljava/lang/String; */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeFieldName ( v11 ); // invoke-virtual {p1, v11}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 113 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeStartObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeStartObject()V
/* .line 114 */
(( java.util.HashMap ) v7 ).entrySet ( ); // invoke-virtual {v7}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .restart local v5 # "i$":Ljava/util/Iterator; */
v11 = } // :goto_2
if ( v11 != null) { // if-eqz v11, :cond_5
/* check-cast v2, Ljava/util/Map$Entry; */
/* .line 115 */
/* .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Integer;>;" */
/* check-cast v11, Ljava/lang/String; */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeFieldName ( v11 ); // invoke-virtual {p1, v11}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 116 */
/* check-cast v11, Ljava/lang/Integer; */
v11 = (( java.lang.Integer ) v11 ).intValue ( ); // invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeNumber ( v11 ); // invoke-virtual {p1, v11}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(I)V
/* .line 118 */
} // .end local v2 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Integer;>;"
} // :cond_5
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeEndObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeEndObject()V
/* goto/16 :goto_0 */
/* .line 122 */
} // .end local v1 # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/openfeint/internal/resource/ResourceProperty;>;"
} // .end local v5 # "i$":Ljava/util/Iterator;
} // .end local v7 # "r":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;"
} // :cond_6
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeEndObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeEndObject()V
/* .line 123 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeEndObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator;->writeEndObject()V
/* .line 124 */
return;
} // .end method
public final void generateToStream ( java.io.OutputStream p0 ) {
/* .locals 3 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 56 */
/* new-instance v0, Lorg/codehaus/jackson/JsonFactory; */
/* invoke-direct {v0}, Lorg/codehaus/jackson/JsonFactory;-><init>()V */
/* .line 57 */
/* .local v0, "jf":Lorg/codehaus/jackson/JsonFactory; */
v2 = org.codehaus.jackson.JsonEncoding.UTF8;
(( org.codehaus.jackson.JsonFactory ) v0 ).createJsonGenerator ( p1, v2 ); // invoke-virtual {v0, p1, v2}, Lorg/codehaus/jackson/JsonFactory;->createJsonGenerator(Ljava/io/OutputStream;Lorg/codehaus/jackson/JsonEncoding;)Lorg/codehaus/jackson/JsonGenerator;
/* .line 58 */
/* .local v1, "jg":Lorg/codehaus/jackson/JsonGenerator; */
(( com.openfeint.internal.resource.Resource ) p0 ).generate ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/resource/Resource;->generate(Lorg/codehaus/jackson/JsonGenerator;)V
/* .line 59 */
(( org.codehaus.jackson.JsonGenerator ) v1 ).close ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonGenerator;->close()V
/* .line 60 */
return;
} // .end method
public java.lang.String resourceID ( ) {
/* .locals 1 */
/* .prologue */
/* .line 27 */
v0 = this.mID;
} // .end method
public void setResourceID ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "id" # Ljava/lang/String; */
/* .prologue */
/* .line 28 */
this.mID = p1;
return;
} // .end method
public final void shallowCopy ( com.openfeint.internal.resource.Resource p0 ) {
/* .locals 2 */
/* .param p1, "otherResource" # Lcom/openfeint/internal/resource/Resource; */
/* .prologue */
/* .line 127 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v0, v1, :cond_0 */
/* .line 128 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "You can only shallowCopy the same type of resource"; // const-string v1, "You can only shallowCopy the same type of resource"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 131 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/resource/Resource;->unguardedShallowCopy(Lcom/openfeint/internal/resource/Resource;)V */
/* .line 132 */
return;
} // .end method
public final void shallowCopyAncestorType ( com.openfeint.internal.resource.Resource p0 ) {
/* .locals 5 */
/* .param p1, "otherResource" # Lcom/openfeint/internal/resource/Resource; */
/* .prologue */
/* .line 135 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 136 */
/* .local v0, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 137 */
/* .local v1, "o":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
/* const-class v2, Lcom/openfeint/internal/resource/Resource; */
/* if-eq v1, v2, :cond_1 */
/* .line 138 */
} // :goto_0
/* if-eq v0, v1, :cond_0 */
/* const-class v2, Lcom/openfeint/internal/resource/Resource; */
/* if-eq v0, v2, :cond_0 */
/* .line 139 */
(( java.lang.Class ) v0 ).getSuperclass ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
/* .line 141 */
} // :cond_0
/* const-class v2, Lcom/openfeint/internal/resource/Resource; */
/* if-ne v0, v2, :cond_1 */
/* .line 142 */
/* new-instance v2, Ljava/lang/UnsupportedOperationException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " is not a superclass of "; // const-string v4, " is not a superclass of "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 146 */
} // :cond_1
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/resource/Resource;->unguardedShallowCopy(Lcom/openfeint/internal/resource/Resource;)V */
/* .line 147 */
return;
} // .end method
