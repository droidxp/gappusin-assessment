public class com.openfeint.internal.SyncedStore {
	 /* .source "SyncedStore.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/SyncedStore$Reader;, */
	 /* Lcom/openfeint/internal/SyncedStore$Editor; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String FILENAME;
private static final java.lang.String TAG;
/* # instance fields */
private android.content.Context mContext;
private java.util.concurrent.locks.ReentrantReadWriteLock mLock;
private java.util.HashMap mMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.openfeint.internal.SyncedStore ( ) {
/* .locals 1 */
/* .param p1, "c" # Landroid/content/Context; */
/* .prologue */
/* .line 79 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 80 */
this.mContext = p1;
/* .line 81 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mMap = v0;
/* .line 82 */
/* new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock; */
/* invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V */
this.mLock = v0;
/* .line 83 */
(( com.openfeint.internal.SyncedStore ) p0 ).load ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/SyncedStore;->load()V
/* .line 84 */
return;
} // .end method
static java.util.HashMap access$000 ( com.openfeint.internal.SyncedStore p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/SyncedStore; */
/* .prologue */
/* .line 24 */
v0 = this.mMap;
} // .end method
static java.util.concurrent.locks.ReentrantReadWriteLock access$100 ( com.openfeint.internal.SyncedStore p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/SyncedStore; */
/* .prologue */
/* .line 24 */
v0 = this.mLock;
} // .end method
private java.util.HashMap mapFromStore ( java.io.File p0 ) {
/* .locals 9 */
/* .param p1, "myStore" # Ljava/io/File; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* ")", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 144 */
int v1 = 0; // const/4 v1, 0x0
/* .line 145 */
/* .local v1, "is":Ljava/io/InputStream; */
int v4 = 0; // const/4 v4, 0x0
/* .line 147 */
/* .local v4, "ois":Ljava/io/ObjectInputStream; */
try { // :try_start_0
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/io/StreamCorruptedException; {:try_start_0 ..:try_end_0} :catch_4 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_6 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_8 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 148 */
} // .end local v1 # "is":Ljava/io/InputStream;
/* .local v2, "is":Ljava/io/InputStream; */
try { // :try_start_1
/* new-instance v5, Ljava/io/ObjectInputStream; */
/* invoke-direct {v5, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_1 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_1 ..:try_end_1} :catch_11 */
/* .catch Ljava/io/StreamCorruptedException; {:try_start_1 ..:try_end_1} :catch_f */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_d */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_1 ..:try_end_1} :catch_b */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 149 */
} // .end local v4 # "ois":Ljava/io/ObjectInputStream;
/* .local v5, "ois":Ljava/io/ObjectInputStream; */
try { // :try_start_2
(( java.io.ObjectInputStream ) v5 ).readObject ( ); // invoke-virtual {v5}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* .line 150 */
/* .local v3, "o":Ljava/lang/Object; */
if ( v3 != null) { // if-eqz v3, :cond_2
/* instance-of v6, v3, Ljava/util/HashMap; */
if ( v6 != null) { // if-eqz v6, :cond_2
	 /* .line 151 */
	 /* check-cast v3, Ljava/util/HashMap; */
	 /* :try_end_2 */
	 /* .catch Ljava/io/FileNotFoundException; {:try_start_2 ..:try_end_2} :catch_12 */
	 /* .catch Ljava/io/StreamCorruptedException; {:try_start_2 ..:try_end_2} :catch_10 */
	 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_e */
	 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_2 ..:try_end_2} :catch_c */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
	 /* .line 163 */
} // .end local v3 # "o":Ljava/lang/Object;
if ( v5 != null) { // if-eqz v5, :cond_1
	 /* .line 164 */
	 try { // :try_start_3
		 (( java.io.ObjectInputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/ObjectInputStream;->close()V
	 } // :cond_0
} // :goto_0
/* move-object v4, v5 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v4 # "ois":Ljava/io/ObjectInputStream; */
/* move-object v1, v2 */
/* .line 172 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
} // :goto_1
/* .line 165 */
} // .end local v1 # "is":Ljava/io/InputStream;
} // .end local v4 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 166 */
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .line 168 */
/* :catch_0 */
/* move-exception v0 */
/* .line 169 */
/* .local v0, "e":Ljava/io/IOException; */
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "IOException while cleaning up"; // const-string v7, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* .line 163 */
} // .end local v0 # "e":Ljava/io/IOException;
/* .restart local v3 # "o":Ljava/lang/Object; */
} // :cond_2
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 164 */
try { // :try_start_4
(( java.io.ObjectInputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/ObjectInputStream;->close()V
} // :cond_3
} // :goto_2
/* move-object v4, v5 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v4 # "ois":Ljava/io/ObjectInputStream; */
/* move-object v1, v2 */
/* .line 172 */
} // .end local v2 # "is":Ljava/io/InputStream;
} // .end local v3 # "o":Ljava/lang/Object;
/* .restart local v1 # "is":Ljava/io/InputStream; */
} // :cond_4
} // :goto_3
int v3 = 0; // const/4 v3, 0x0
/* .line 165 */
} // .end local v1 # "is":Ljava/io/InputStream;
} // .end local v4 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v3 # "o":Ljava/lang/Object; */
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
} // :cond_5
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 166 */
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
/* .line 168 */
/* :catch_1 */
/* move-exception v0 */
/* .line 169 */
/* .restart local v0 # "e":Ljava/io/IOException; */
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "IOException while cleaning up"; // const-string v7, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* move-object v4, v5 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v4 # "ois":Ljava/io/ObjectInputStream; */
/* move-object v1, v2 */
/* .line 171 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
/* .line 153 */
} // .end local v0 # "e":Ljava/io/IOException;
} // .end local v3 # "o":Ljava/lang/Object;
/* :catch_2 */
/* move-exception v0 */
/* .line 154 */
/* .local v0, "e":Ljava/io/FileNotFoundException; */
} // :goto_4
try { // :try_start_5
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "Couldn\'t open of_prefs"; // const-string v7, "Couldn\'t open of_prefs"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 163 */
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 164 */
try { // :try_start_6
(( java.io.ObjectInputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_3 */
/* .line 168 */
/* :catch_3 */
/* move-exception v0 */
/* .line 169 */
/* .local v0, "e":Ljava/io/IOException; */
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "IOException while cleaning up"; // const-string v7, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* .line 165 */
/* .local v0, "e":Ljava/io/FileNotFoundException; */
} // :cond_6
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 166 */
try { // :try_start_7
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_3 */
/* .line 155 */
} // .end local v0 # "e":Ljava/io/FileNotFoundException;
/* :catch_4 */
/* move-exception v0 */
/* .line 156 */
/* .local v0, "e":Ljava/io/StreamCorruptedException; */
} // :goto_5
try { // :try_start_8
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "StreamCorruptedException"; // const-string v7, "StreamCorruptedException"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* .line 163 */
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 164 */
try { // :try_start_9
(( java.io.ObjectInputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_5 */
/* .line 168 */
/* :catch_5 */
/* move-exception v0 */
/* .line 169 */
/* .local v0, "e":Ljava/io/IOException; */
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "IOException while cleaning up"; // const-string v7, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* .line 165 */
/* .local v0, "e":Ljava/io/StreamCorruptedException; */
} // :cond_7
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 166 */
try { // :try_start_a
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_a */
/* .catch Ljava/io/IOException; {:try_start_a ..:try_end_a} :catch_5 */
/* .line 157 */
} // .end local v0 # "e":Ljava/io/StreamCorruptedException;
/* :catch_6 */
/* move-exception v0 */
/* .line 158 */
/* .local v0, "e":Ljava/io/IOException; */
} // :goto_6
try { // :try_start_b
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "IOException while reading"; // const-string v7, "IOException while reading"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* :try_end_b */
/* .catchall {:try_start_b ..:try_end_b} :catchall_0 */
/* .line 163 */
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 164 */
try { // :try_start_c
(( java.io.ObjectInputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_c */
/* .catch Ljava/io/IOException; {:try_start_c ..:try_end_c} :catch_7 */
/* .line 168 */
/* :catch_7 */
/* move-exception v0 */
/* .line 169 */
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "IOException while cleaning up"; // const-string v7, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* .line 165 */
} // :cond_8
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 166 */
try { // :try_start_d
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_d */
/* .catch Ljava/io/IOException; {:try_start_d ..:try_end_d} :catch_7 */
/* .line 159 */
} // .end local v0 # "e":Ljava/io/IOException;
/* :catch_8 */
/* move-exception v0 */
/* .line 160 */
/* .local v0, "e":Ljava/lang/ClassNotFoundException; */
} // :goto_7
try { // :try_start_e
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "ClassNotFoundException"; // const-string v7, "ClassNotFoundException"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* :try_end_e */
/* .catchall {:try_start_e ..:try_end_e} :catchall_0 */
/* .line 163 */
if ( v4 != null) { // if-eqz v4, :cond_9
/* .line 164 */
try { // :try_start_f
(( java.io.ObjectInputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_f */
/* .catch Ljava/io/IOException; {:try_start_f ..:try_end_f} :catch_9 */
/* .line 168 */
/* :catch_9 */
/* move-exception v0 */
/* .line 169 */
/* .local v0, "e":Ljava/io/IOException; */
final String v6 = "DistributedPrefs"; // const-string v6, "DistributedPrefs"
final String v7 = "IOException while cleaning up"; // const-string v7, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* .line 165 */
/* .local v0, "e":Ljava/lang/ClassNotFoundException; */
} // :cond_9
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 166 */
try { // :try_start_10
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_10 */
/* .catch Ljava/io/IOException; {:try_start_10 ..:try_end_10} :catch_9 */
/* goto/16 :goto_3 */
/* .line 162 */
} // .end local v0 # "e":Ljava/lang/ClassNotFoundException;
/* :catchall_0 */
/* move-exception v6 */
/* .line 163 */
} // :goto_8
if ( v4 != null) { // if-eqz v4, :cond_b
/* .line 164 */
try { // :try_start_11
(( java.io.ObjectInputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_11 */
/* .catch Ljava/io/IOException; {:try_start_11 ..:try_end_11} :catch_a */
/* .line 170 */
} // :cond_a
} // :goto_9
/* throw v6 */
/* .line 165 */
} // :cond_b
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 166 */
try { // :try_start_12
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_12 */
/* .catch Ljava/io/IOException; {:try_start_12 ..:try_end_12} :catch_a */
/* .line 168 */
/* :catch_a */
/* move-exception v0 */
/* .line 169 */
/* .local v0, "e":Ljava/io/IOException; */
final String v7 = "DistributedPrefs"; // const-string v7, "DistributedPrefs"
final String v8 = "IOException while cleaning up"; // const-string v8, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v7,v8 );
/* .line 162 */
} // .end local v0 # "e":Ljava/io/IOException;
} // .end local v1 # "is":Ljava/io/InputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* :catchall_1 */
/* move-exception v6 */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
} // .end local v1 # "is":Ljava/io/InputStream;
} // .end local v4 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
/* :catchall_2 */
/* move-exception v6 */
/* move-object v4, v5 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v4 # "ois":Ljava/io/ObjectInputStream; */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
/* .line 159 */
} // .end local v1 # "is":Ljava/io/InputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* :catch_b */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
} // .end local v1 # "is":Ljava/io/InputStream;
} // .end local v4 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
/* :catch_c */
/* move-exception v0 */
/* move-object v4, v5 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v4 # "ois":Ljava/io/ObjectInputStream; */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
/* .line 157 */
} // .end local v1 # "is":Ljava/io/InputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* :catch_d */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
} // .end local v1 # "is":Ljava/io/InputStream;
} // .end local v4 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
/* :catch_e */
/* move-exception v0 */
/* move-object v4, v5 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v4 # "ois":Ljava/io/ObjectInputStream; */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
/* .line 155 */
} // .end local v1 # "is":Ljava/io/InputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* :catch_f */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
/* goto/16 :goto_5 */
} // .end local v1 # "is":Ljava/io/InputStream;
} // .end local v4 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
/* :catch_10 */
/* move-exception v0 */
/* move-object v4, v5 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v4 # "ois":Ljava/io/ObjectInputStream; */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
/* goto/16 :goto_5 */
/* .line 153 */
} // .end local v1 # "is":Ljava/io/InputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* :catch_11 */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
/* goto/16 :goto_4 */
} // .end local v1 # "is":Ljava/io/InputStream;
} // .end local v4 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
/* :catch_12 */
/* move-exception v0 */
/* move-object v4, v5 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v4 # "ois":Ljava/io/ObjectInputStream; */
/* move-object v1, v2 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
/* goto/16 :goto_4 */
} // .end method
/* # virtual methods */
com.openfeint.internal.SyncedStore$Editor edit ( ) {
/* .locals 1 */
/* .prologue */
/* .line 48 */
v0 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v0 ).writeLock ( ); // invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ) v0 ).lock ( ); // invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
/* .line 49 */
/* new-instance v0, Lcom/openfeint/internal/SyncedStore$Editor; */
/* invoke-direct {v0, p0}, Lcom/openfeint/internal/SyncedStore$Editor;-><init>(Lcom/openfeint/internal/SyncedStore;)V */
} // .end method
public void load ( ) {
/* .locals 21 */
/* .prologue */
/* .line 88 */
/* const/16 v17, 0x0 */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, p0 */
this.mMap = v0;
/* .line 89 */
int v8 = 0; // const/4 v8, 0x0
/* .line 91 */
/* .local v8, "mustSaveAfterLoad":Z */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v14 */
/* .line 93 */
/* .local v14, "start":J */
/* move-object/from16 v0, p0 */
v0 = this.mContext;
/* move-object/from16 v17, v0 */
final String v18 = "of_prefs"; // const-string v18, "of_prefs"
/* invoke-virtual/range {v17 ..v18}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File; */
/* .line 95 */
/* .local v10, "myStore":Ljava/io/File; */
/* move-object/from16 v0, p0 */
v0 = this.mLock;
/* move-object/from16 v17, v0 */
/* invoke-virtual/range {v17 ..v17}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock; */
/* invoke-virtual/range {v17 ..v17}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V */
/* .line 97 */
try { // :try_start_0
/* move-object/from16 v0, p0 */
v0 = this.mContext;
/* move-object/from16 v17, v0 */
/* invoke-virtual/range {v17 ..v17}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager; */
/* .line 98 */
/* .local v13, "packageManager":Landroid/content/pm/PackageManager; */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
(( android.content.pm.PackageManager ) v13 ).getInstalledApplications ( v0 ); // invoke-virtual {v13, v0}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;
/* .line 99 */
/* .local v3, "apps":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ApplicationInfo;>;" */
int v9 = 0; // const/4 v9, 0x0
/* .line 101 */
/* .local v9, "myInfo":Landroid/content/pm/ApplicationInfo; */
/* .local v7, "i$":Ljava/util/Iterator; */
v17 = } // :cond_0
if ( v17 != null) { // if-eqz v17, :cond_1
/* check-cast v2, Landroid/content/pm/ApplicationInfo; */
/* .line 102 */
/* .local v2, "ai":Landroid/content/pm/ApplicationInfo; */
v0 = this.packageName;
/* move-object/from16 v17, v0 */
/* move-object/from16 v0, p0 */
v0 = this.mContext;
/* move-object/from16 v18, v0 */
/* invoke-virtual/range {v18 ..v18}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
v17 = /* invoke-virtual/range {v17 ..v18}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z */
if ( v17 != null) { // if-eqz v17, :cond_0
/* .line 103 */
/* move-object v9, v2 */
/* .line 108 */
} // .end local v2 # "ai":Landroid/content/pm/ApplicationInfo;
} // :cond_1
(( java.io.File ) v10 ).getCanonicalPath ( ); // invoke-virtual {v10}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* .line 109 */
/* .local v11, "myStoreCPath":Ljava/lang/String; */
if ( v9 != null) { // if-eqz v9, :cond_4
v0 = this.dataDir;
/* move-object/from16 v17, v0 */
/* move-object/from16 v0, v17 */
v17 = (( java.lang.String ) v11 ).startsWith ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v17 != null) { // if-eqz v17, :cond_4
/* .line 110 */
v0 = this.dataDir;
/* move-object/from16 v17, v0 */
v17 = /* invoke-virtual/range {v17 ..v17}, Ljava/lang/String;->length()I */
/* move/from16 v0, v17 */
(( java.lang.String ) v11 ).substring ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 112 */
/* .local v16, "underDataDir":Ljava/lang/String; */
} // :cond_2
v17 = } // :goto_0
if ( v17 != null) { // if-eqz v17, :cond_3
/* check-cast v2, Landroid/content/pm/ApplicationInfo; */
/* .line 113 */
/* .restart local v2 # "ai":Landroid/content/pm/ApplicationInfo; */
/* new-instance v12, Ljava/io/File; */
v0 = this.dataDir;
/* move-object/from16 v17, v0 */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, v16 */
/* invoke-direct {v12, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 115 */
/* .local v12, "otherStore":Ljava/io/File; */
(( java.io.File ) v10 ).lastModified ( ); // invoke-virtual {v10}, Ljava/io/File;->lastModified()J
/* move-result-wide v17 */
(( java.io.File ) v12 ).lastModified ( ); // invoke-virtual {v12}, Ljava/io/File;->lastModified()J
/* move-result-wide v19 */
/* cmp-long v17, v17, v19 */
/* if-gez v17, :cond_2 */
/* .line 118 */
int v8 = 1; // const/4 v8, 0x1
/* .line 120 */
/* move-object v10, v12 */
/* .line 124 */
} // .end local v2 # "ai":Landroid/content/pm/ApplicationInfo;
} // .end local v12 # "otherStore":Ljava/io/File;
} // :cond_3
/* move-object/from16 v0, p0 */
/* invoke-direct {v0, v10}, Lcom/openfeint/internal/SyncedStore;->mapFromStore(Ljava/io/File;)Ljava/util/HashMap; */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, p0 */
this.mMap = v0;
/* .line 127 */
} // .end local v16 # "underDataDir":Ljava/lang/String;
} // :cond_4
/* move-object/from16 v0, p0 */
v0 = this.mMap;
/* move-object/from16 v17, v0 */
/* if-nez v17, :cond_5 */
/* new-instance v17, Ljava/util/HashMap; */
/* invoke-direct/range {v17 ..v17}, Ljava/util/HashMap;-><init>()V */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, p0 */
this.mMap = v0;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 131 */
} // :cond_5
/* move-object/from16 v0, p0 */
v0 = this.mLock;
/* move-object/from16 v17, v0 */
/* invoke-virtual/range {v17 ..v17}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock; */
/* invoke-virtual/range {v17 ..v17}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V */
/* .line 134 */
} // .end local v3 # "apps":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ApplicationInfo;>;"
} // .end local v7 # "i$":Ljava/util/Iterator;
} // .end local v9 # "myInfo":Landroid/content/pm/ApplicationInfo;
} // .end local v11 # "myStoreCPath":Ljava/lang/String;
} // .end local v13 # "packageManager":Landroid/content/pm/PackageManager;
} // :goto_1
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 135 */
/* invoke-virtual/range {p0 ..p0}, Lcom/openfeint/internal/SyncedStore;->save()V */
/* .line 138 */
} // :cond_6
java.lang.System .currentTimeMillis ( );
/* move-result-wide v17 */
/* sub-long v5, v17, v14 */
/* .line 139 */
/* .local v5, "elapsed":J */
final String v17 = "DistributedPrefs"; // const-string v17, "DistributedPrefs"
/* new-instance v18, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v18 ..v18}, Ljava/lang/StringBuilder;-><init>()V */
final String v19 = "Loading prefs took "; // const-string v19, "Loading prefs took "
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* new-instance v19, Ljava/lang/Long; */
/* move-object/from16 v0, v19 */
/* invoke-direct {v0, v5, v6}, Ljava/lang/Long;-><init>(J)V */
/* invoke-virtual/range {v19 ..v19}, Ljava/lang/Long;->toString()Ljava/lang/String; */
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v19 = " millis"; // const-string v19, " millis"
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v18 ..v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v17 ..v18}, Lcom/openfeint/internal/OpenFeintInternal;->log(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 140 */
return;
/* .line 128 */
} // .end local v5 # "elapsed":J
/* :catch_0 */
/* move-exception v4 */
/* .line 129 */
/* .local v4, "e1":Ljava/io/IOException; */
try { // :try_start_1
final String v17 = "DistributedPrefs"; // const-string v17, "DistributedPrefs"
final String v18 = "broken"; // const-string v18, "broken"
/* invoke-static/range {v17 ..v18}, Lcom/openfeint/internal/OpenFeintInternal;->log(Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 131 */
/* move-object/from16 v0, p0 */
v0 = this.mLock;
/* move-object/from16 v17, v0 */
/* invoke-virtual/range {v17 ..v17}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock; */
/* invoke-virtual/range {v17 ..v17}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V */
} // .end local v4 # "e1":Ljava/io/IOException;
/* :catchall_0 */
/* move-exception v17 */
/* move-object/from16 v0, p0 */
v0 = this.mLock;
/* move-object/from16 v18, v0 */
/* invoke-virtual/range {v18 ..v18}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock; */
/* invoke-virtual/range {v18 ..v18}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V */
/* throw v17 */
} // .end method
com.openfeint.internal.SyncedStore$Reader read ( ) {
/* .locals 1 */
/* .prologue */
/* .line 68 */
v0 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v0 ).readLock ( ); // invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v0 ).lock ( ); // invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V
/* .line 69 */
/* new-instance v0, Lcom/openfeint/internal/SyncedStore$Reader; */
/* invoke-direct {v0, p0}, Lcom/openfeint/internal/SyncedStore$Reader;-><init>(Lcom/openfeint/internal/SyncedStore;)V */
} // .end method
public void save ( ) {
/* .locals 7 */
/* .prologue */
/* .line 176 */
int v3 = 0; // const/4 v3, 0x0
/* .line 177 */
/* .local v3, "os":Ljava/io/OutputStream; */
int v1 = 0; // const/4 v1, 0x0
/* .line 179 */
/* .local v1, "oos":Ljava/io/ObjectOutputStream; */
v4 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v4 ).readLock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v4 ).lock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V
/* .line 181 */
try { // :try_start_0
v4 = this.mContext;
final String v5 = "of_prefs"; // const-string v5, "of_prefs"
int v6 = 1; // const/4 v6, 0x1
(( android.content.Context ) v4 ).openFileOutput ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
/* .line 182 */
/* new-instance v2, Ljava/io/ObjectOutputStream; */
/* invoke-direct {v2, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
/* .line 183 */
} // .end local v1 # "oos":Ljava/io/ObjectOutputStream;
/* .local v2, "oos":Ljava/io/ObjectOutputStream; */
try { // :try_start_1
v4 = this.mMap;
(( java.io.ObjectOutputStream ) v2 ).writeObject ( v4 ); // invoke-virtual {v2, v4}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_4 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_4 */
/* .line 188 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 189 */
try { // :try_start_2
(( java.io.ObjectOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 196 */
} // :cond_0
} // :goto_0
v4 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v4 ).readLock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v4 ).unlock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
} // :goto_1
/* move-object v1, v2 */
/* .line 199 */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v1 # "oos":Ljava/io/ObjectOutputStream; */
} // :goto_2
return;
/* .line 190 */
} // .end local v1 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v2 # "oos":Ljava/io/ObjectOutputStream; */
} // :cond_1
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 191 */
try { // :try_start_3
(( java.io.OutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 193 */
/* :catch_0 */
/* move-exception v0 */
/* .line 194 */
/* .local v0, "e":Ljava/io/IOException; */
try { // :try_start_4
final String v4 = "DistributedPrefs"; // const-string v4, "DistributedPrefs"
final String v5 = "IOException while cleaning up"; // const-string v5, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 196 */
v4 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v4 ).readLock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v4 ).unlock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
} // .end local v0 # "e":Ljava/io/IOException;
/* :catchall_0 */
/* move-exception v4 */
v5 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v5 ).readLock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v5 ).unlock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
/* throw v4 */
/* .line 184 */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v1 # "oos":Ljava/io/ObjectOutputStream; */
/* :catch_1 */
/* move-exception v0 */
/* .line 185 */
/* .restart local v0 # "e":Ljava/io/IOException; */
} // :goto_3
try { // :try_start_5
final String v4 = "DistributedPrefs"; // const-string v4, "DistributedPrefs"
final String v5 = "Couldn\'t open of_prefs for writing"; // const-string v5, "Couldn\'t open of_prefs for writing"
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
/* .line 188 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 189 */
try { // :try_start_6
(( java.io.ObjectOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_2 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
/* .line 196 */
} // :cond_2
} // :goto_4
v4 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v4 ).readLock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v4 ).unlock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
/* .line 190 */
} // :cond_3
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 191 */
try { // :try_start_7
(( java.io.OutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_2 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* .line 193 */
/* :catch_2 */
/* move-exception v0 */
/* .line 194 */
try { // :try_start_8
final String v4 = "DistributedPrefs"; // const-string v4, "DistributedPrefs"
final String v5 = "IOException while cleaning up"; // const-string v5, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_1 */
/* .line 196 */
v4 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v4 ).readLock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v4 ).unlock ( ); // invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
/* :catchall_1 */
/* move-exception v4 */
v5 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v5 ).readLock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v5 ).unlock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
/* throw v4 */
/* .line 187 */
} // .end local v0 # "e":Ljava/io/IOException;
/* :catchall_2 */
/* move-exception v4 */
/* .line 188 */
} // :goto_5
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 189 */
try { // :try_start_9
(( java.io.ObjectOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_3 */
/* .catchall {:try_start_9 ..:try_end_9} :catchall_3 */
/* .line 196 */
} // :cond_4
} // :goto_6
v5 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v5 ).readLock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v5 ).unlock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
} // :goto_7
/* throw v4 */
/* .line 190 */
} // :cond_5
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 191 */
try { // :try_start_a
(( java.io.OutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
/* :try_end_a */
/* .catch Ljava/io/IOException; {:try_start_a ..:try_end_a} :catch_3 */
/* .catchall {:try_start_a ..:try_end_a} :catchall_3 */
/* .line 193 */
/* :catch_3 */
/* move-exception v0 */
/* .line 194 */
/* .restart local v0 # "e":Ljava/io/IOException; */
try { // :try_start_b
final String v5 = "DistributedPrefs"; // const-string v5, "DistributedPrefs"
final String v6 = "IOException while cleaning up"; // const-string v6, "IOException while cleaning up"
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* :try_end_b */
/* .catchall {:try_start_b ..:try_end_b} :catchall_3 */
/* .line 196 */
v5 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v5 ).readLock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v5 ).unlock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
} // .end local v0 # "e":Ljava/io/IOException;
/* :catchall_3 */
/* move-exception v4 */
v5 = this.mLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock ) v5 ).readLock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
(( java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ) v5 ).unlock ( ); // invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V
/* throw v4 */
/* .line 187 */
} // .end local v1 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v2 # "oos":Ljava/io/ObjectOutputStream; */
/* :catchall_4 */
/* move-exception v4 */
/* move-object v1, v2 */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v1 # "oos":Ljava/io/ObjectOutputStream; */
/* .line 184 */
} // .end local v1 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v2 # "oos":Ljava/io/ObjectOutputStream; */
/* :catch_4 */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v1 # "oos":Ljava/io/ObjectOutputStream; */
} // .end method
