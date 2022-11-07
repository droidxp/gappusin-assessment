class com.google.i18n.phonenumbers.RegexCache$LRUCache$1 extends java.util.LinkedHashMap {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/i18n/phonenumbers/RegexCache$LRUCache;-><init>(Lcom/google/i18n/phonenumbers/RegexCache;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedHashMap", */
/* "<TK;TV;>;" */
/* } */
} // .end annotation
/* # instance fields */
final com.google.i18n.phonenumbers.RegexCache$LRUCache this$1; //synthetic
final com.google.i18n.phonenumbers.RegexCache val$this$0; //synthetic
/* # direct methods */
 com.google.i18n.phonenumbers.RegexCache$LRUCache$1 ( ) {
/* .locals 0 */
this.this$1 = p1;
this.val$this$0 = p5;
/* invoke-direct {p0, p2, p3, p4}, Ljava/util/LinkedHashMap;-><init>(IFZ)V */
return;
} // .end method
/* # virtual methods */
protected Boolean removeEldestEntry ( java.util.Map$Entry p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map$Entry", */
/* "<TK;TV;>;)Z" */
/* } */
} // .end annotation
v0 = (( com.google.i18n.phonenumbers.RegexCache$LRUCache$1 ) p0 ).size ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache$1;->size()I
v1 = this.this$1;
v1 = com.google.i18n.phonenumbers.RegexCache$LRUCache .access$000 ( v1 );
/* if-le v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
