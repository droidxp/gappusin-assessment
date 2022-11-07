public abstract class org.apache.commons.codec.language.bm.Languages$LanguageSet {
	 /* .source "Languages.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/commons/codec/language/bm/Languages; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "LanguageSet" */
} // .end annotation
/* # direct methods */
public org.apache.commons.codec.language.bm.Languages$LanguageSet ( ) {
/* .locals 0 */
/* .prologue */
/* .line 61 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static org.apache.commons.codec.language.bm.Languages$LanguageSet from ( java.util.Set p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 64 */
v0 = /* .local p0, "langs":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES;
} // :goto_0
} // :cond_0
/* new-instance v0, Lorg/apache/commons/codec/language/bm/Languages$SomeLanguages; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lorg/apache/commons/codec/language/bm/Languages$SomeLanguages;-><init>(Ljava/util/Set;Lorg/apache/commons/codec/language/bm/Languages$1;)V */
} // .end method
/* # virtual methods */
public abstract Boolean contains ( java.lang.String p0 ) {
} // .end method
public abstract java.lang.String getAny ( ) {
} // .end method
public abstract Boolean isEmpty ( ) {
} // .end method
public abstract Boolean isSingleton ( ) {
} // .end method
public abstract org.apache.commons.codec.language.bm.Languages$LanguageSet restrictTo ( org.apache.commons.codec.language.bm.Languages$LanguageSet p0 ) {
} // .end method
