class com.google.i18n.phonenumbers.RegexCache$LRUCache {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/i18n/phonenumbers/RegexCache; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "LRUCache" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* # instance fields */
private java.util.LinkedHashMap map;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedHashMap", */
/* "<TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
private Integer size;
final com.google.i18n.phonenumbers.RegexCache this$0; //synthetic
/* # direct methods */
public com.google.i18n.phonenumbers.RegexCache$LRUCache ( ) {
/* .locals 6 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* iput p2, p0, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache;->size:I */
/* new-instance v0, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache$1; */
/* mul-int/lit8 v1, p2, 0x4 */
/* div-int/lit8 v1, v1, 0x3 */
/* add-int/lit8 v2, v1, 0x1 */
/* const/high16 v3, 0x3f400000 # 0.75f */
int v4 = 1; // const/4 v4, 0x1
/* move-object v1, p0 */
/* move-object v5, p1 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache$1;-><init>(Lcom/google/i18n/phonenumbers/RegexCache$LRUCache;IFZLcom/google/i18n/phonenumbers/RegexCache;)V */
this.map = v0;
return;
} // .end method
static Integer access$000 ( com.google.i18n.phonenumbers.RegexCache$LRUCache p0 ) { //synthethic
/* .locals 1 */
/* iget v0, p0, Lcom/google/i18n/phonenumbers/RegexCache$LRUCache;->size:I */
} // .end method
/* # virtual methods */
public synchronized Boolean containsKey ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)Z" */
/* } */
} // .end annotation
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.map;
(( java.util.LinkedHashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized java.lang.Object get ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)TV;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.map;
(( java.util.LinkedHashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void put ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.map;
(( java.util.LinkedHashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
