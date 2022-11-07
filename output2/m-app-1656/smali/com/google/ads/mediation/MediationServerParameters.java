public abstract class com.google.ads.mediation.MediationServerParameters {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/mediation/MediationServerParameters$MappingException;, */
	 /* Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
	 /* } */
} // .end annotation
/* # direct methods */
public com.google.ads.mediation.MediationServerParameters ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 33 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 49 */
	 return;
} // .end method
/* # virtual methods */
protected void a ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 112 */
	 return;
} // .end method
public void load ( java.util.Map p0 ) {
	 /* .locals 6 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;)V" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/ads/mediation/MediationServerParameters$MappingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 61 */
/* .local p1, "parameters":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* new-instance v3, Ljava/util/HashMap; */
/* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
/* .line 62 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getFields ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;
/* array-length v4, v2 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
} // :goto_0
/* if-ge v1, v4, :cond_1 */
/* aget-object v5, v2, v1 */
/* .line 63 */
/* const-class v0, Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
(( java.lang.reflect.Field ) v5 ).getAnnotation ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/* check-cast v0, Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
/* .line 64 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 65 */
/* .line 62 */
} // :cond_0
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* .line 69 */
v0 = } // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 70 */
final String v0 = "No server options fields detected.To suppress this message either add a field with the @Parameter annotation, or override the load() method"; // const-string v0, "No server options fields detected.To suppress this message either add a field with the @Parameter annotation, or override the load() method"
com.google.ads.util.b .e ( v0 );
/* .line 74 */
} // :cond_2
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* move-object v1, v0 */
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 75 */
/* check-cast v0, Ljava/lang/reflect/Field; */
/* .line 76 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 78 */
try { // :try_start_0
(( java.lang.reflect.Field ) v0 ).set ( p0, v4 ); // invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 79 */
/* :catch_0 */
/* move-exception v0 */
/* .line 80 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Server Option \'"; // const-string v4, "Server Option \'"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v0, Ljava/lang/String; */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\' could not be set: Illegal Access"; // const-string v1, "\' could not be set: Illegal Access"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v0 );
/* .line 81 */
/* :catch_1 */
/* move-exception v0 */
/* .line 82 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Server Option \'"; // const-string v4, "Server Option \'"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v0, Ljava/lang/String; */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\' could not be set: Bad Type"; // const-string v1, "\' could not be set: Bad Type"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v0 );
/* .line 85 */
} // :cond_3
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unexpected Server Option: "; // const-string v4, "Unexpected Server Option: "
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v0, Ljava/lang/String; */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " = \'"; // const-string v4, " = \'"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v0, Ljava/lang/String; */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\'"; // const-string v1, "\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
/* goto/16 :goto_1 */
/* .line 90 */
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
/* .line 91 */
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
/* check-cast v0, Ljava/lang/reflect/Field; */
/* .line 92 */
/* const-class v1, Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
(( java.lang.reflect.Field ) v0 ).getAnnotation ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
v1 = /* check-cast v1, Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 93 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Required Server Option missing: "; // const-string v4, "Required Server Option missing: "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const-class v1, Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
(( java.lang.reflect.Field ) v0 ).getAnnotation ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/* check-cast v1, Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v1 );
/* .line 95 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
/* if-nez v2, :cond_5 */
final String v1 = ""; // const-string v1, ""
} // :goto_3
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const-class v2, Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
(( java.lang.reflect.Field ) v0 ).getAnnotation ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/* check-cast v0, Lcom/google/ads/mediation/MediationServerParameters$Parameter; */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_4
/* move-object v2, v0 */
} // :cond_5
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 101 */
} // :cond_6
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 102 */
/* new-instance v0, Lcom/google/ads/mediation/MediationServerParameters$MappingException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Required Server Option(s) missing: "; // const-string v3, "Required Server Option(s) missing: "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/google/ads/mediation/MediationServerParameters$MappingException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 105 */
} // :cond_7
(( com.google.ads.mediation.MediationServerParameters ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/mediation/MediationServerParameters;->a()V
/* .line 106 */
return;
} // :cond_8
/* move-object v0, v2 */
} // .end method
