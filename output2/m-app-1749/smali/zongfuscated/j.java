public class zongfuscated.j {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # instance fields */
	 private java.util.HashMap b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/ref/WeakReference", */
	 /* "<", */
	 /* "Landroid/content/Context;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static zongfuscated.j ( ) {
/* .locals 1 */
/* const-class v0, Lzongfuscated/j; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
return;
} // .end method
public zongfuscated.j ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public synchronized final android.content.Context a ( java.lang.String p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.b;
	 (( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/ref/WeakReference; */
	 /* if-nez v0, :cond_0 */
	 v0 = zongfuscated.j.a;
	 final String v1 = "Invalid Context"; // const-string v1, "Invalid Context"
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-array v2, v2, [Ljava/lang/String; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* aput-object p1, v2, v3 */
	 zongfuscated.q .a ( v0,v1,v2 );
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
v1 = zongfuscated.j.a;
final String v2 = "Getting Context"; // const-string v2, "Getting Context"
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object p1, v3, v4 */
zongfuscated.q .a ( v1,v2,v3 );
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized final void a ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 4 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* new-instance v0, Ljava/lang/ref/WeakReference; */
	 /* invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
	 v1 = this.b;
	 (( java.util.HashMap ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 v0 = zongfuscated.j.a;
	 final String v1 = "Setting Context"; // const-string v1, "Setting Context"
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-array v2, v2, [Ljava/lang/String; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* aput-object p1, v2, v3 */
	 zongfuscated.q .a ( v0,v1,v2 );
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized final void b ( java.lang.String p0 ) {
	 /* .locals 4 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 v0 = this.b;
		 (( java.util.HashMap ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
		 v0 = zongfuscated.j.a;
		 final String v1 = "Reseting Context"; // const-string v1, "Reseting Context"
		 int v2 = 1; // const/4 v2, 0x1
		 /* new-array v2, v2, [Ljava/lang/String; */
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object p1, v2, v3 */
		 zongfuscated.q .a ( v0,v1,v2 );
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 return;
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
