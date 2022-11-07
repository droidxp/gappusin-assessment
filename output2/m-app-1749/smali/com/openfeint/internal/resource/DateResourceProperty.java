public abstract class com.openfeint.internal.resource.DateResourceProperty extends com.openfeint.internal.resource.PrimitiveResourceProperty {
	 /* .source "DateResourceProperty.java" */
	 /* # static fields */
	 public static java.text.DateFormat sDateParser;
	 /* # direct methods */
	 static com.openfeint.internal.resource.DateResourceProperty ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 com.openfeint.internal.resource.DateResourceProperty .makeDateParser ( );
		 return;
	 } // .end method
	 public com.openfeint.internal.resource.DateResourceProperty ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/PrimitiveResourceProperty;-><init>()V */
		 return;
	 } // .end method
	 static java.text.DateFormat makeDateParser ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 27 */
		 /* new-instance v0, Ljava/text/SimpleDateFormat; */
		 final String v1 = "yyyy-MM-dd HH:mm:ss"; // const-string v1, "yyyy-MM-dd HH:mm:ss"
		 /* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
		 /* .line 28 */
		 /* .local v0, "p":Ljava/text/DateFormat; */
		 final String v1 = "UTC"; // const-string v1, "UTC"
		 java.util.TimeZone .getTimeZone ( v1 );
		 (( java.text.DateFormat ) v0 ).setTimeZone ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
		 /* .line 29 */
	 } // .end method
	 /* # virtual methods */
	 public void copy ( com.openfeint.internal.resource.Resource p0, com.openfeint.internal.resource.Resource p1 ) {
		 /* .locals 1 */
		 /* .param p1, "lhs" # Lcom/openfeint/internal/resource/Resource; */
		 /* .param p2, "rhs" # Lcom/openfeint/internal/resource/Resource; */
		 /* .prologue */
		 /* .line 20 */
		 (( com.openfeint.internal.resource.DateResourceProperty ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/resource/DateResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/util/Date;
		 (( com.openfeint.internal.resource.DateResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/DateResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/util/Date;)V
		 /* .line 21 */
		 return;
	 } // .end method
	 public void generate ( com.openfeint.internal.resource.Resource p0, org.codehaus.jackson.JsonGenerator p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 /* .param p1, "obj" # Lcom/openfeint/internal/resource/Resource; */
		 /* .param p2, "generator" # Lorg/codehaus/jackson/JsonGenerator; */
		 /* .param p3, "key" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/codehaus/jackson/JsonGenerationException;, */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 45 */
	 (( com.openfeint.internal.resource.DateResourceProperty ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/resource/DateResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/util/Date;
	 /* .line 46 */
	 /* .local v0, "o":Ljava/util/Date; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 47 */
		 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeFieldName ( p3 ); // invoke-virtual {p2, p3}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
		 /* .line 48 */
		 v1 = com.openfeint.internal.resource.DateResourceProperty.sDateParser;
		 (( java.text.DateFormat ) v1 ).format ( v0 ); // invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
		 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeString ( v1 ); // invoke-virtual {p2, v1}, Lorg/codehaus/jackson/JsonGenerator;->writeString(Ljava/lang/String;)V
		 /* .line 50 */
	 } // :cond_0
	 return;
} // .end method
public abstract java.util.Date get ( com.openfeint.internal.resource.Resource p0 ) {
} // .end method
public void parse ( com.openfeint.internal.resource.Resource p0, org.codehaus.jackson.JsonParser p1 ) {
	 /* .locals 4 */
	 /* .param p1, "obj" # Lcom/openfeint/internal/resource/Resource; */
	 /* .param p2, "jp" # Lorg/codehaus/jackson/JsonParser; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/JsonParseException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 34 */
(( org.codehaus.jackson.JsonParser ) p2 ).getText ( ); // invoke-virtual {p2}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
/* .line 35 */
/* .local v1, "text":Ljava/lang/String; */
final String v2 = "null"; // const-string v2, "null"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 36 */
	 (( com.openfeint.internal.resource.DateResourceProperty ) p0 ).set ( p1, v3 ); // invoke-virtual {p0, p1, v3}, Lcom/openfeint/internal/resource/DateResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/util/Date;)V
	 /* .line 42 */
} // :goto_0
return;
/* .line 38 */
} // :cond_0
try { // :try_start_0
v2 = com.openfeint.internal.resource.DateResourceProperty.sDateParser;
(( java.text.DateFormat ) v2 ).parse ( v1 ); // invoke-virtual {v2, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
(( com.openfeint.internal.resource.DateResourceProperty ) p0 ).set ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lcom/openfeint/internal/resource/DateResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/util/Date;)V
/* :try_end_0 */
/* .catch Ljava/text/ParseException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 39 */
/* :catch_0 */
/* move-exception v0 */
/* .line 40 */
/* .local v0, "e":Ljava/text/ParseException; */
(( com.openfeint.internal.resource.DateResourceProperty ) p0 ).set ( p1, v3 ); // invoke-virtual {p0, p1, v3}, Lcom/openfeint/internal/resource/DateResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/util/Date;)V
} // .end method
public abstract void set ( com.openfeint.internal.resource.Resource p0, java.util.Date p1 ) {
} // .end method
