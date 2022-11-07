public class com.google.i18n.phonenumbers.RegexCache {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/i18n/phonenumbers/RegexCache$LRUCache; */
	 /* } */
} // .end annotation
/* # instance fields */
private com.google.i18n.phonenumbers.RegexCache$LRUCache cache;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/i18n/phonenumbers/RegexCache$LRUCache", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/regex/Pattern;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.i18n.phonenumbers.RegexCache ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache; */
/* invoke-direct {v0, p0, p1}, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache;-><init>(Lcom/google/i18n/phonenumbers/RegexCache;I)V */
this.cache = v0;
return;
} // .end method
/* # virtual methods */
Boolean containsRegex ( java.lang.String p0 ) {
/* .locals 1 */
v0 = this.cache;
v0 = (( com.google.i18n.phonenumbers.RegexCache$LRUCache ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache;->containsKey(Ljava/lang/Object;)Z
} // .end method
public java.util.regex.Pattern getPatternForRegex ( java.lang.String p0 ) {
/* .locals 2 */
v0 = this.cache;
(( com.google.i18n.phonenumbers.RegexCache$LRUCache ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/regex/Pattern; */
/* if-nez v0, :cond_0 */
java.util.regex.Pattern .compile ( p1 );
v1 = this.cache;
(( com.google.i18n.phonenumbers.RegexCache$LRUCache ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;)V
} // :cond_0
} // .end method
