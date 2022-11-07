public class com.openfeint.internal.JsonResourceParser {
	 /* .source "JsonResourceParser.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private org.codehaus.jackson.JsonParser mParser;
	 /* # direct methods */
	 public com.openfeint.internal.JsonResourceParser ( ) {
		 /* .locals 0 */
		 /* .param p1, "parser" # Lorg/codehaus/jackson/JsonParser; */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 25 */
		 this.mParser = p1;
		 /* .line 26 */
		 return;
	 } // .end method
	 private java.util.ArrayList parseArray ( ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "()", */
		 /* "Ljava/util/ArrayList", */
		 /* "<", */
		 /* "Lcom/openfeint/internal/resource/Resource;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/JsonParseException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 159 */
v1 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v1 ).nextToken ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 161 */
/* .local v0, "tok":Lorg/codehaus/jackson/JsonToken; */
v1 = org.codehaus.jackson.JsonToken.VALUE_NULL;
/* if-ne v0, v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 167 */
} // :goto_0
/* .line 163 */
} // :cond_0
v1 = org.codehaus.jackson.JsonToken.START_ARRAY;
/* if-eq v0, v1, :cond_1 */
/* .line 164 */
/* new-instance v1, Lorg/codehaus/jackson/JsonParseException; */
final String v2 = "Wanted START_ARRAY"; // const-string v2, "Wanted START_ARRAY"
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).getCurrentLocation ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->getCurrentLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v1, v2, v3}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v1 */
/* .line 167 */
} // :cond_1
/* invoke-direct {p0}, Lcom/openfeint/internal/JsonResourceParser;->parseOpenedArray()Ljava/util/ArrayList; */
} // .end method
private java.util.HashMap parseHash ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 128 */
v1 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v1 ).nextToken ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 129 */
/* .local v0, "tok":Lorg/codehaus/jackson/JsonToken; */
v1 = org.codehaus.jackson.JsonToken.VALUE_NULL;
/* if-ne v0, v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 132 */
} // :goto_0
/* .line 130 */
} // :cond_0
v1 = org.codehaus.jackson.JsonToken.START_OBJECT;
/* if-eq v0, v1, :cond_1 */
/* .line 131 */
/* new-instance v1, Lorg/codehaus/jackson/JsonParseException; */
final String v2 = "Expected START_OBJECT"; // const-string v2, "Expected START_OBJECT"
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).getCurrentLocation ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->getCurrentLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v1, v2, v3}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v1 */
/* .line 132 */
} // :cond_1
/* invoke-direct {p0}, Lcom/openfeint/internal/JsonResourceParser;->parseOpenedHash()Ljava/util/HashMap; */
} // .end method
private java.util.ArrayList parseOpenedArray ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 172 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 174 */
/* .local v0, "resources":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/openfeint/internal/resource/Resource;>;" */
} // :goto_0
v1 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v1 ).nextToken ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v2 = org.codehaus.jackson.JsonToken.END_ARRAY;
/* if-eq v1, v2, :cond_0 */
/* .line 175 */
/* invoke-direct {p0}, Lcom/openfeint/internal/JsonResourceParser;->parseResource()Lcom/openfeint/internal/resource/Resource; */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 178 */
} // :cond_0
} // .end method
private java.util.HashMap parseOpenedHash ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 136 */
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
/* .line 138 */
/* .local v1, "resources":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;" */
} // :goto_0
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).nextToken ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v4 = org.codehaus.jackson.JsonToken.FIELD_NAME;
/* if-ne v3, v4, :cond_0 */
/* .line 139 */
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).getText ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
/* .line 140 */
/* .local v0, "className":Ljava/lang/String; */
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).nextToken ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 141 */
v3 = this.mParser;
v2 = (( org.codehaus.jackson.JsonParser ) v3 ).getIntValue ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->getIntValue()I
/* .line 142 */
/* .local v2, "v":I */
java.lang.Integer .valueOf ( v2 );
(( java.util.HashMap ) v1 ).put ( v0, v3 ); // invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 144 */
} // .end local v0 # "className":Ljava/lang/String;
} // .end local v2 # "v":I
} // :cond_0
} // .end method
private com.openfeint.internal.resource.Resource parseOpenedResource ( com.openfeint.internal.resource.ResourceClass p0 ) {
/* .locals 11 */
/* .param p1, "resourceClass" # Lcom/openfeint/internal/resource/ResourceClass; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 88 */
(( com.openfeint.internal.resource.ResourceClass ) p1 ).factory ( ); // invoke-virtual {p1}, Lcom/openfeint/internal/resource/ResourceClass;->factory()Lcom/openfeint/internal/resource/Resource;
/* .line 90 */
/* .local v7, "resource":Lcom/openfeint/internal/resource/Resource; */
} // :goto_0
v8 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v8 ).nextToken ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v9 = org.codehaus.jackson.JsonToken.FIELD_NAME;
/* if-ne v8, v9, :cond_6 */
/* .line 91 */
v8 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v8 ).getText ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
/* .line 92 */
/* .local v2, "name":Ljava/lang/String; */
v8 = this.mProperties;
(( java.util.HashMap ) v8 ).get ( v2 ); // invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v5, Lcom/openfeint/internal/resource/ResourceProperty; */
/* .line 93 */
/* .local v5, "prop":Lcom/openfeint/internal/resource/ResourceProperty; */
/* if-nez v5, :cond_0 */
/* .line 95 */
v8 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v8 ).nextToken ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 96 */
v8 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v8 ).skipChildren ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/JsonParser;->skipChildren()Lorg/codehaus/jackson/JsonParser;
/* .line 97 */
} // :cond_0
/* instance-of v8, v5, Lcom/openfeint/internal/resource/PrimitiveResourceProperty; */
if ( v8 != null) { // if-eqz v8, :cond_1
/* move-object v4, v5 */
/* .line 98 */
/* check-cast v4, Lcom/openfeint/internal/resource/PrimitiveResourceProperty; */
/* .line 99 */
/* .local v4, "pprop":Lcom/openfeint/internal/resource/PrimitiveResourceProperty; */
v8 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v8 ).nextToken ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 100 */
v8 = this.mParser;
(( com.openfeint.internal.resource.PrimitiveResourceProperty ) v4 ).parse ( v7, v8 ); // invoke-virtual {v4, v7, v8}, Lcom/openfeint/internal/resource/PrimitiveResourceProperty;->parse(Lcom/openfeint/internal/resource/Resource;Lorg/codehaus/jackson/JsonParser;)V
/* .line 101 */
} // .end local v4 # "pprop":Lcom/openfeint/internal/resource/PrimitiveResourceProperty;
} // :cond_1
/* instance-of v8, v5, Lcom/openfeint/internal/resource/NestedResourceProperty; */
if ( v8 != null) { // if-eqz v8, :cond_3
/* move-object v3, v5 */
/* .line 102 */
/* check-cast v3, Lcom/openfeint/internal/resource/NestedResourceProperty; */
/* .line 103 */
/* .local v3, "nprop":Lcom/openfeint/internal/resource/NestedResourceProperty; */
(( com.openfeint.internal.resource.NestedResourceProperty ) v3 ).getType ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/resource/NestedResourceProperty;->getType()Ljava/lang/Class;
com.openfeint.internal.resource.Resource .getKlass ( v8 );
/* .line 104 */
/* .local v6, "rc":Lcom/openfeint/internal/resource/ResourceClass; */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 105 */
/* invoke-direct {p0, v6}, Lcom/openfeint/internal/JsonResourceParser;->parseResource(Lcom/openfeint/internal/resource/ResourceClass;)Lcom/openfeint/internal/resource/Resource; */
(( com.openfeint.internal.resource.NestedResourceProperty ) v3 ).set ( v7, v8 ); // invoke-virtual {v3, v7, v8}, Lcom/openfeint/internal/resource/NestedResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Lcom/openfeint/internal/resource/Resource;)V
/* .line 107 */
} // :cond_2
final String v8 = "JsonResourceParser"; // const-string v8, "JsonResourceParser"
/* new-instance v9, Ljava/lang/StringBuilder; */
/* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
final String v10 = "unknown "; // const-string v10, "unknown "
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.openfeint.internal.resource.NestedResourceProperty ) v3 ).getType ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/resource/NestedResourceProperty;->getType()Ljava/lang/Class;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v8,v9 );
/* .line 109 */
} // .end local v3 # "nprop":Lcom/openfeint/internal/resource/NestedResourceProperty;
} // .end local v6 # "rc":Lcom/openfeint/internal/resource/ResourceClass;
} // :cond_3
/* instance-of v8, v5, Lcom/openfeint/internal/resource/ArrayResourceProperty; */
if ( v8 != null) { // if-eqz v8, :cond_4
/* move-object v0, v5 */
/* .line 110 */
/* check-cast v0, Lcom/openfeint/internal/resource/ArrayResourceProperty; */
/* .line 111 */
/* .local v0, "aprop":Lcom/openfeint/internal/resource/ArrayResourceProperty; */
/* invoke-direct {p0}, Lcom/openfeint/internal/JsonResourceParser;->parseArray()Ljava/util/ArrayList; */
(( com.openfeint.internal.resource.ArrayResourceProperty ) v0 ).set ( v7, v8 ); // invoke-virtual {v0, v7, v8}, Lcom/openfeint/internal/resource/ArrayResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/util/List;)V
/* .line 112 */
} // .end local v0 # "aprop":Lcom/openfeint/internal/resource/ArrayResourceProperty;
} // :cond_4
/* instance-of v8, v5, Lcom/openfeint/internal/resource/HashIntResourceProperty; */
if ( v8 != null) { // if-eqz v8, :cond_5
/* move-object v1, v5 */
/* .line 113 */
/* check-cast v1, Lcom/openfeint/internal/resource/HashIntResourceProperty; */
/* .line 114 */
/* .local v1, "hprop":Lcom/openfeint/internal/resource/HashIntResourceProperty; */
/* invoke-direct {p0}, Lcom/openfeint/internal/JsonResourceParser;->parseHash()Ljava/util/HashMap; */
(( com.openfeint.internal.resource.HashIntResourceProperty ) v1 ).set ( v7, v8 ); // invoke-virtual {v1, v7, v8}, Lcom/openfeint/internal/resource/HashIntResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/util/HashMap;)V
/* goto/16 :goto_0 */
/* .line 116 */
} // .end local v1 # "hprop":Lcom/openfeint/internal/resource/HashIntResourceProperty;
} // :cond_5
final String v8 = "JsonResourceParser"; // const-string v8, "JsonResourceParser"
final String v9 = "Totally don\'t know what to do about this property"; // const-string v9, "Totally don\'t know what to do about this property"
com.openfeint.internal.OpenFeintInternal .log ( v8,v9 );
/* .line 117 */
v8 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v8 ).skipChildren ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/JsonParser;->skipChildren()Lorg/codehaus/jackson/JsonParser;
/* goto/16 :goto_0 */
/* .line 121 */
} // .end local v2 # "name":Ljava/lang/String;
} // .end local v5 # "prop":Lcom/openfeint/internal/resource/ResourceProperty;
} // :cond_6
v8 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v8 ).getCurrentToken ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/JsonParser;->getCurrentToken()Lorg/codehaus/jackson/JsonToken;
v9 = org.codehaus.jackson.JsonToken.END_OBJECT;
/* if-eq v8, v9, :cond_7 */
/* .line 122 */
/* new-instance v8, Lorg/codehaus/jackson/JsonParseException; */
/* new-instance v9, Ljava/lang/StringBuilder; */
/* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
final String v10 = "Expected END_OBJECT of "; // const-string v10, "Expected END_OBJECT of "
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v10 = this.mResourceName;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v10 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v10 ).getCurrentLocation ( ); // invoke-virtual {v10}, Lorg/codehaus/jackson/JsonParser;->getCurrentLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v8, v9, v10}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v8 */
/* .line 124 */
} // :cond_7
} // .end method
private com.openfeint.internal.resource.Resource parseResource ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 148 */
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).nextToken ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v4 = org.codehaus.jackson.JsonToken.FIELD_NAME;
/* if-eq v3, v4, :cond_0 */
/* new-instance v3, Lorg/codehaus/jackson/JsonParseException; */
final String v4 = "Couldn\'t find wrapper object."; // const-string v4, "Couldn\'t find wrapper object."
v5 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v5 ).getTokenLocation ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v3, v4, v5}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v3 */
/* .line 149 */
} // :cond_0
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).getText ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
/* .line 150 */
/* .local v0, "className":Ljava/lang/String; */
com.openfeint.internal.resource.Resource .getKlass ( v0 );
/* .line 151 */
/* .local v1, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
/* if-nez v1, :cond_1 */
/* new-instance v3, Lorg/codehaus/jackson/JsonParseException; */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Don\'t know class \'"; // const-string v5, "Don\'t know class \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\'."; // const-string v5, "\'."
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v5 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v5 ).getTokenLocation ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v3, v4, v5}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v3 */
/* .line 152 */
} // :cond_1
/* invoke-direct {p0, v1}, Lcom/openfeint/internal/JsonResourceParser;->parseResource(Lcom/openfeint/internal/resource/ResourceClass;)Lcom/openfeint/internal/resource/Resource; */
/* .line 153 */
/* .local v2, "rv":Lcom/openfeint/internal/resource/Resource; */
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).nextToken ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v4 = org.codehaus.jackson.JsonToken.END_OBJECT;
/* if-eq v3, v4, :cond_2 */
/* new-instance v3, Lorg/codehaus/jackson/JsonParseException; */
final String v4 = "Expected only one k/v in wrapper object."; // const-string v4, "Expected only one k/v in wrapper object."
v5 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v5 ).getTokenLocation ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v3, v4, v5}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v3 */
/* .line 154 */
} // :cond_2
} // .end method
private com.openfeint.internal.resource.Resource parseResource ( com.openfeint.internal.resource.ResourceClass p0 ) {
/* .locals 4 */
/* .param p1, "resourceClass" # Lcom/openfeint/internal/resource/ResourceClass; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 77 */
v1 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v1 ).nextToken ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 78 */
/* .local v0, "tok":Lorg/codehaus/jackson/JsonToken; */
v1 = org.codehaus.jackson.JsonToken.VALUE_NULL;
/* if-ne v0, v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 83 */
} // :goto_0
/* .line 80 */
} // :cond_0
v1 = org.codehaus.jackson.JsonToken.START_OBJECT;
/* if-eq v0, v1, :cond_1 */
/* .line 81 */
/* new-instance v1, Lorg/codehaus/jackson/JsonParseException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Expected START_OBJECT of "; // const-string v3, "Expected START_OBJECT of "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.mResourceName;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).getCurrentLocation ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->getCurrentLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v1, v2, v3}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v1 */
/* .line 83 */
} // :cond_1
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/JsonResourceParser;->parseOpenedResource(Lcom/openfeint/internal/resource/ResourceClass;)Lcom/openfeint/internal/resource/Resource; */
} // .end method
/* # virtual methods */
public java.lang.Object parse ( ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 30 */
v5 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v5 ).nextToken ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 31 */
/* .local v1, "firstTok":Lorg/codehaus/jackson/JsonToken; */
/* if-nez v1, :cond_1 */
/* .line 34 */
int v3 = 0; // const/4 v3, 0x0
/* .line 58 */
} // :cond_0
/* .line 37 */
} // :cond_1
v5 = org.codehaus.jackson.JsonToken.START_OBJECT;
/* if-eq v1, v5, :cond_2 */
/* new-instance v5, Lorg/codehaus/jackson/JsonParseException; */
final String v6 = "Couldn\'t find toplevel wrapper object."; // const-string v6, "Couldn\'t find toplevel wrapper object."
v7 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v7 ).getTokenLocation ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v5, v6, v7}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v5 */
/* .line 38 */
} // :cond_2
v5 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v5 ).nextToken ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v6 = org.codehaus.jackson.JsonToken.FIELD_NAME;
/* if-eq v5, v6, :cond_3 */
/* new-instance v5, Lorg/codehaus/jackson/JsonParseException; */
final String v6 = "Couldn\'t find toplevel wrapper object."; // const-string v6, "Couldn\'t find toplevel wrapper object."
v7 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v7 ).getTokenLocation ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v5, v6, v7}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v5 */
/* .line 39 */
} // :cond_3
v5 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v5 ).getText ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
/* .line 41 */
/* .local v0, "classOrArrayName":Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* .line 43 */
/* .local v3, "rv":Ljava/lang/Object; */
v5 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v5 ).nextToken ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 44 */
/* .local v4, "tok":Lorg/codehaus/jackson/JsonToken; */
v5 = org.codehaus.jackson.JsonToken.START_ARRAY;
/* if-ne v4, v5, :cond_4 */
/* .line 46 */
/* invoke-direct {p0}, Lcom/openfeint/internal/JsonResourceParser;->parseOpenedArray()Ljava/util/ArrayList; */
/* .line 56 */
} // .end local v3 # "rv":Ljava/lang/Object;
} // :goto_0
v5 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v5 ).nextToken ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v6 = org.codehaus.jackson.JsonToken.END_OBJECT;
/* if-eq v5, v6, :cond_0 */
/* new-instance v5, Lorg/codehaus/jackson/JsonParseException; */
final String v6 = "Expected only one k/v in toplevel wrapper object."; // const-string v6, "Expected only one k/v in toplevel wrapper object."
v7 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v7 ).getTokenLocation ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v5, v6, v7}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v5 */
/* .line 47 */
/* .restart local v3 # "rv":Ljava/lang/Object; */
} // :cond_4
v5 = org.codehaus.jackson.JsonToken.START_OBJECT;
/* if-ne v4, v5, :cond_6 */
/* .line 49 */
com.openfeint.internal.resource.Resource .getKlass ( v0 );
/* .line 50 */
/* .local v2, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
/* if-nez v2, :cond_5 */
/* new-instance v5, Lorg/codehaus/jackson/JsonParseException; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Unknown toplevel class \'"; // const-string v7, "Unknown toplevel class \'"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "\'."; // const-string v7, "\'."
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v7 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v7 ).getTokenLocation ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v5, v6, v7}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v5 */
/* .line 51 */
} // :cond_5
/* invoke-direct {p0, v2}, Lcom/openfeint/internal/JsonResourceParser;->parseOpenedResource(Lcom/openfeint/internal/resource/ResourceClass;)Lcom/openfeint/internal/resource/Resource; */
/* .line 52 */
/* .local v3, "rv":Lcom/openfeint/internal/resource/Resource; */
/* .line 53 */
} // .end local v2 # "klass":Lcom/openfeint/internal/resource/ResourceClass;
/* .local v3, "rv":Ljava/lang/Object; */
} // :cond_6
/* new-instance v5, Lorg/codehaus/jackson/JsonParseException; */
final String v6 = "Expected object or array at top level."; // const-string v6, "Expected object or array at top level."
v7 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v7 ).getTokenLocation ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v5, v6, v7}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v5 */
} // .end method
public java.lang.Object parse ( com.openfeint.internal.resource.ResourceClass p0 ) {
/* .locals 4 */
/* .param p1, "resourceClass" # Lcom/openfeint/internal/resource/ResourceClass; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 63 */
v1 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v1 ).nextToken ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 64 */
/* .local v0, "firstTok":Lorg/codehaus/jackson/JsonToken; */
/* if-nez v0, :cond_0 */
/* .line 67 */
int v1 = 0; // const/4 v1, 0x0
/* .line 71 */
} // :goto_0
/* .line 70 */
} // :cond_0
v1 = org.codehaus.jackson.JsonToken.START_OBJECT;
/* if-eq v0, v1, :cond_1 */
/* new-instance v1, Lorg/codehaus/jackson/JsonParseException; */
final String v2 = "Couldn\'t find toplevel wrapper object."; // const-string v2, "Couldn\'t find toplevel wrapper object."
v3 = this.mParser;
(( org.codehaus.jackson.JsonParser ) v3 ).getTokenLocation ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonParser;->getTokenLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v1, v2, v3}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v1 */
/* .line 71 */
} // :cond_1
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/JsonResourceParser;->parseOpenedResource(Lcom/openfeint/internal/resource/ResourceClass;)Lcom/openfeint/internal/resource/Resource; */
} // .end method
