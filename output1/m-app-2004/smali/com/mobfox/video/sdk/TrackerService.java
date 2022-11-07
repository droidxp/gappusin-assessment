public class com.mobfox.video.sdk.TrackerService {
	 /* .source "TrackerService.java" */
	 /* # static fields */
	 private static java.lang.Object sLock;
	 private static java.util.Queue sRetryTrackEvents;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Queue", */
	 /* "<", */
	 /* "Lcom/mobfox/video/sdk/TrackEvent;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static Boolean sStopped;
private static java.lang.Thread sThread;
private static Boolean sThreadRunning;
private static java.util.Queue sTrackEvents;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Queue", */
/* "<", */
/* "Lcom/mobfox/video/sdk/TrackEvent;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.mobfox.video.sdk.TrackerService ( ) {
/* .locals 1 */
/* .prologue */
/* .line 28 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
/* .line 34 */
int v0 = 0; // const/4 v0, 0x0
com.mobfox.video.sdk.TrackerService.sThreadRunning = (v0!= 0);
/* .line 39 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
/* .line 44 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
/* .line 23 */
return;
} // .end method
public com.mobfox.video.sdk.TrackerService ( ) {
/* .locals 0 */
/* .prologue */
/* .line 23 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static void access$0 ( Boolean p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 48 */
com.mobfox.video.sdk.TrackerService.sStopped = (p0!= 0);
return;
} // .end method
static Boolean access$1 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 48 */
/* sget-boolean v0, Lcom/mobfox/video/sdk/TrackerService;->sStopped:Z */
} // .end method
static Boolean access$2 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 104 */
v0 = com.mobfox.video.sdk.TrackerService .hasMoreUpdates ( );
} // .end method
static com.mobfox.video.sdk.TrackEvent access$3 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 119 */
com.mobfox.video.sdk.TrackerService .getNextUpdate ( );
} // .end method
static java.util.Queue access$4 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 39 */
v0 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
} // .end method
static java.util.Queue access$5 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 44 */
v0 = com.mobfox.video.sdk.TrackerService.sRetryTrackEvents;
} // .end method
static java.lang.Object access$6 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 28 */
v0 = com.mobfox.video.sdk.TrackerService.sLock;
} // .end method
static void access$7 ( Boolean p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 34 */
com.mobfox.video.sdk.TrackerService.sThreadRunning = (p0!= 0);
return;
} // .end method
static void access$8 ( java.lang.Thread p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 46 */
return;
} // .end method
private static com.mobfox.video.sdk.TrackEvent getNextUpdate ( ) {
/* .locals 3 */
/* .prologue */
/* .line 120 */
v2 = com.mobfox.video.sdk.TrackerService.sLock;
/* monitor-enter v2 */
/* .line 121 */
try { // :try_start_0
v1 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
/* if-nez v1, :cond_0 */
/* .line 122 */
/* monitor-exit v2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 125 */
/* .local v0, "nextTrackEvent":Lcom/mobfox/video/sdk/TrackEvent; */
} // :goto_0
/* .line 124 */
} // .end local v0 # "nextTrackEvent":Lcom/mobfox/video/sdk/TrackEvent;
} // :cond_0
v1 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
/* check-cast v0, Lcom/mobfox/video/sdk/TrackEvent; */
/* .line 125 */
/* .restart local v0 # "nextTrackEvent":Lcom/mobfox/video/sdk/TrackEvent; */
/* monitor-exit v2 */
/* .line 120 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
private static Boolean hasMoreUpdates ( ) {
/* .locals 5 */
/* .prologue */
/* .line 105 */
v2 = com.mobfox.video.sdk.TrackerService.sLock;
/* monitor-enter v2 */
/* .line 106 */
try { // :try_start_0
v1 = v1 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
if ( v1 != null) { // if-eqz v1, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 107 */
/* .local v0, "hasMore":Z */
} // :goto_0
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
int v3 = 3; // const/4 v3, 0x3
v1 = android.util.Log .isLoggable ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 108 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* .line 109 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "More updates:"; // const-string v4, "More updates:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v4 = " size:"; // const-string v4, " size:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 110 */
v4 = v4 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 109 */
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 108 */
android.util.Log .d ( v1,v3 );
/* .line 112 */
} // :cond_0
/* monitor-exit v2 */
/* .line 106 */
} // .end local v0 # "hasMore":Z
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 105 */
/* .restart local v0 # "hasMore":Z */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public static void release ( ) {
/* .locals 2 */
/* .prologue */
/* .line 234 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "release"; // const-string v1, "release"
android.util.Log .v ( v0,v1 );
/* .line 235 */
v0 = com.mobfox.video.sdk.TrackerService.sThread;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 236 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "release stopping Tracking events thread"; // const-string v1, "release stopping Tracking events thread"
android.util.Log .v ( v0,v1 );
/* .line 237 */
int v0 = 1; // const/4 v0, 0x1
com.mobfox.video.sdk.TrackerService.sStopped = (v0!= 0);
/* .line 239 */
} // :cond_0
return;
} // .end method
public static void requestRetry ( com.mobfox.video.sdk.TrackEvent p0 ) {
/* .locals 4 */
/* .param p0, "trackEvent" # Lcom/mobfox/video/sdk/TrackEvent; */
/* .prologue */
/* .line 90 */
v1 = com.mobfox.video.sdk.TrackerService.sLock;
/* monitor-enter v1 */
/* .line 91 */
try { // :try_start_0
v0 = v0 = com.mobfox.video.sdk.TrackerService.sRetryTrackEvents;
/* if-nez v0, :cond_0 */
/* .line 92 */
/* iget v0, p0, Lcom/mobfox/video/sdk/TrackEvent;->retries:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/mobfox/video/sdk/TrackEvent;->retries:I */
/* .line 93 */
/* iget v0, p0, Lcom/mobfox/video/sdk/TrackEvent;->retries:I */
int v2 = 5; // const/4 v2, 0x5
/* if-gt v0, v2, :cond_0 */
/* .line 94 */
v0 = com.mobfox.video.sdk.TrackerService.sRetryTrackEvents;
/* .line 97 */
} // :cond_0
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v2 = 3; // const/4 v2, 0x3
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 98 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* .line 99 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Added retry track event:"; // const-string v3, "Added retry track event:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = v3 = com.mobfox.video.sdk.TrackerService.sRetryTrackEvents;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 98 */
android.util.Log .d ( v0,v2 );
/* .line 90 */
} // :cond_1
/* monitor-exit v1 */
/* .line 102 */
return;
/* .line 90 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void requestTrack ( com.mobfox.video.sdk.TrackEvent p0 ) {
/* .locals 4 */
/* .param p0, "trackEvent" # Lcom/mobfox/video/sdk/TrackEvent; */
/* .prologue */
/* .line 73 */
v1 = com.mobfox.video.sdk.TrackerService.sLock;
/* monitor-enter v1 */
/* .line 74 */
try { // :try_start_0
v0 = v0 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
/* if-nez v0, :cond_0 */
/* .line 75 */
v0 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
/* .line 77 */
} // :cond_0
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v2 = 3; // const/4 v2, 0x3
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 78 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Added track event:"; // const-string v3, "Added track event:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = v3 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v2 );
/* .line 73 */
} // :cond_1
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 81 */
/* sget-boolean v0, Lcom/mobfox/video/sdk/TrackerService;->sThreadRunning:Z */
/* if-nez v0, :cond_2 */
/* .line 82 */
com.mobfox.video.sdk.TrackerService .startTracking ( );
/* .line 84 */
} // :cond_2
return;
/* .line 73 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_1
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
public static void requestTrack ( com.mobfox.video.sdk.TrackEvent[] p0 ) {
/* .locals 5 */
/* .param p0, "trackEvents" # [Lcom/mobfox/video/sdk/TrackEvent; */
/* .prologue */
/* .line 54 */
v2 = com.mobfox.video.sdk.TrackerService.sLock;
/* monitor-enter v2 */
/* .line 55 */
try { // :try_start_0
/* array-length v3, p0 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lt v1, v3, :cond_2 */
/* .line 60 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
int v3 = 3; // const/4 v3, 0x3
v1 = android.util.Log .isLoggable ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 61 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Added track event:"; // const-string v4, "Added track event:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = v4 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v3 );
/* .line 54 */
} // :cond_0
/* monitor-exit v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 64 */
/* sget-boolean v1, Lcom/mobfox/video/sdk/TrackerService;->sThreadRunning:Z */
/* if-nez v1, :cond_1 */
/* .line 65 */
com.mobfox.video.sdk.TrackerService .startTracking ( );
/* .line 67 */
} // :cond_1
return;
/* .line 55 */
} // :cond_2
try { // :try_start_1
/* aget-object v0, p0, v1 */
/* .line 56 */
/* .local v0, "trackEvent":Lcom/mobfox/video/sdk/TrackEvent; */
v4 = v4 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
/* if-nez v4, :cond_3 */
/* .line 57 */
v4 = com.mobfox.video.sdk.TrackerService.sTrackEvents;
/* .line 55 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
/* .line 54 */
} // .end local v0 # "trackEvent":Lcom/mobfox/video/sdk/TrackEvent;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v2 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v1 */
} // .end method
public static void startTracking ( ) {
/* .locals 3 */
/* .prologue */
/* .line 136 */
v1 = com.mobfox.video.sdk.TrackerService.sLock;
/* monitor-enter v1 */
/* .line 137 */
try { // :try_start_0
/* sget-boolean v0, Lcom/mobfox/video/sdk/TrackerService;->sThreadRunning:Z */
/* if-nez v0, :cond_0 */
/* .line 138 */
int v0 = 1; // const/4 v0, 0x1
com.mobfox.video.sdk.TrackerService.sThreadRunning = (v0!= 0);
/* .line 139 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v2, Lcom/mobfox/video/sdk/TrackerService$1; */
/* invoke-direct {v2}, Lcom/mobfox/video/sdk/TrackerService$1;-><init>()V */
/* invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 219 */
v0 = com.mobfox.video.sdk.TrackerService.sThread;
/* new-instance v2, Lcom/mobfox/video/sdk/TrackerService$2; */
/* invoke-direct {v2}, Lcom/mobfox/video/sdk/TrackerService$2;-><init>()V */
(( java.lang.Thread ) v0 ).setUncaughtExceptionHandler ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
/* .line 228 */
v0 = com.mobfox.video.sdk.TrackerService.sThread;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 136 */
} // :cond_0
/* monitor-exit v1 */
/* .line 231 */
return;
/* .line 136 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
