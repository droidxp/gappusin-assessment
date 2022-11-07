public abstract class com.google.ads.util.i {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/util/i$1;, */
	 /* Lcom/google/ads/util/i$d;, */
	 /* Lcom/google/ads/util/i$b;, */
	 /* Lcom/google/ads/util/i$c;, */
	 /* Lcom/google/ads/util/i$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.Object a;
private static Integer b;
private static java.util.HashMap c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private final java.util.ArrayList d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/google/ads/util/i$a", */
/* "<*>;>;" */
/* } */
} // .end annotation
} // .end field
public final Integer m;
/* # direct methods */
static com.google.ads.util.i ( ) {
/* .locals 1 */
/* .prologue */
/* .line 25 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
/* .line 26 */
int v0 = 0; // const/4 v0, 0x0
/* .line 27 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public com.google.ads.util.i ( ) {
/* .locals 4 */
/* .prologue */
/* .line 32 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 30 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d = v0;
/* .line 33 */
v1 = com.google.ads.util.i.a;
/* monitor-enter v1 */
/* .line 34 */
try { // :try_start_0
/* add-int/lit8 v2, v0, 0x1 */
/* iput v0, p0, Lcom/google/ads/util/i;->m:I */
/* .line 36 */
v0 = com.google.ads.util.i.c;
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.util.HashMap ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 37 */
/* if-nez v0, :cond_0 */
/* .line 38 */
v0 = com.google.ads.util.i.c;
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v3 = 1; // const/4 v3, 0x1
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 42 */
} // :goto_0
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 44 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "State created: "; // const-string v1, "State created: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.google.ads.util.i ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/google/ads/util/i;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .d ( v0 );
/* .line 45 */
return;
/* .line 40 */
} // :cond_0
try { // :try_start_1
v2 = com.google.ads.util.i.c;
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* add-int/lit8 v0, v0, 0x1 */
java.lang.Integer .valueOf ( v0 );
(( java.util.HashMap ) v2 ).put ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 42 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
private void a ( com.google.ads.util.i$a p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/util/i$a", */
/* "<*>;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 61 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 62 */
return;
} // .end method
static void a ( Object p0, com.google.ads.util.i$a p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 24 */
/* invoke-direct {p0, p1}, Lcom/google/ads/util/i;->a(Lcom/google/ads/util/i$a;)V */
return;
} // .end method
/* # virtual methods */
protected void finalize ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
/* .prologue */
/* .line 49 */
v1 = com.google.ads.util.i.a;
/* monitor-enter v1 */
/* .line 50 */
try { // :try_start_0
v2 = com.google.ads.util.i.c;
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v0 = com.google.ads.util.i.c;
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.util.HashMap ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* add-int/lit8 v0, v0, -0x1 */
java.lang.Integer .valueOf ( v0 );
(( java.util.HashMap ) v2 ).put ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 51 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 52 */
/* invoke-super {p0}, Ljava/lang/Object;->finalize()V */
/* .line 53 */
return;
/* .line 51 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_1
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 57 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/google/ads/util/i;->m:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
