public class com.google.ads.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 private com.google.ads.c a;
	 private Long b;
	 /* # direct methods */
	 public com.google.ads.d ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 38 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 /* .line 39 */
		 /* const-wide/16 v0, -0x1 */
		 /* iput-wide v0, p0, Lcom/google/ads/d;->b:J */
		 /* .line 40 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, Integer p1 ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 57 */
		 this.a = p1;
		 /* .line 58 */
		 v0 = java.util.concurrent.TimeUnit.MILLISECONDS;
		 /* int-to-long v1, p2 */
		 v3 = java.util.concurrent.TimeUnit.SECONDS;
		 (( java.util.concurrent.TimeUnit ) v0 ).convert ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
		 /* move-result-wide v0 */
		 /* .line 60 */
		 android.os.SystemClock .elapsedRealtime ( );
		 /* move-result-wide v2 */
		 /* .line 61 */
		 /* add-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lcom/google/ads/d;->b:J */
		 /* .line 62 */
		 return;
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 47 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 android.os.SystemClock .elapsedRealtime ( );
			 /* move-result-wide v0 */
			 /* iget-wide v2, p0, Lcom/google/ads/d;->b:J */
			 /* cmp-long v0, v0, v2 */
			 /* if-gez v0, :cond_0 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public com.google.ads.c b ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 69 */
	 v0 = this.a;
} // .end method
