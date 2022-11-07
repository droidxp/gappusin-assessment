public class com.openfeint.internal.SyncedStore$Editor {
	 /* .source "SyncedStore.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/SyncedStore; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "Editor" */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.SyncedStore this$0; //synthetic
/* # direct methods */
public com.openfeint.internal.SyncedStore$Editor ( ) {
/* .locals 0 */
/* .prologue */
/* .line 26 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void commit ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.this$0;
(( com.openfeint.internal.SyncedStore ) v0 ).save ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore;->save()V
/* .line 43 */
v0 = this.this$0;
com.openfeint.internal.SyncedStore .access$100 ( v0 );
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v0 ).writeLock ( ); // invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ) v0 ).unlock ( ); // invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
/* .line 44 */
return;
} // .end method
public java.util.Set keySet ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 38 */
/* new-instance v0, Ljava/util/HashSet; */
v1 = this.this$0;
com.openfeint.internal.SyncedStore .access$000 ( v1 );
(( java.util.HashMap ) v1 ).keySet ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
} // .end method
public void putString ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "k" # Ljava/lang/String; */
/* .param p2, "v" # Ljava/lang/String; */
/* .prologue */
/* .line 28 */
v0 = this.this$0;
com.openfeint.internal.SyncedStore .access$000 ( v0 );
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 29 */
return;
} // .end method
public void remove ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "k" # Ljava/lang/String; */
/* .prologue */
/* .line 32 */
v0 = this.this$0;
com.openfeint.internal.SyncedStore .access$000 ( v0 );
(( java.util.HashMap ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 33 */
return;
} // .end method
