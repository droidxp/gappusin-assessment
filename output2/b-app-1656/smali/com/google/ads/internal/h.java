public class com.google.ads.internal.h {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final com.google.ads.internal.h a;
	 /* # instance fields */
	 private final com.google.ads.AdSize b;
	 private final Boolean c;
	 /* # direct methods */
	 static com.google.ads.internal.h ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 24 */
		 /* new-instance v0, Lcom/google/ads/internal/h; */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v0, v1, v2}, Lcom/google/ads/internal/h;-><init>(Lcom/google/ads/AdSize;Z)V */
		 return;
	 } // .end method
	 private com.google.ads.internal.h ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 27 */
		 this.b = p1;
		 /* .line 28 */
		 /* iput-boolean p2, p0, Lcom/google/ads/internal/h;->c:Z */
		 /* .line 29 */
		 return;
	 } // .end method
	 public static com.google.ads.internal.h a ( com.google.ads.AdSize p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 54 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.google.ads.internal.h .a ( p0,v0 );
	 } // .end method
	 public static com.google.ads.internal.h a ( com.google.ads.AdSize p0, android.content.Context p1 ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 41 */
		 /* new-instance v0, Lcom/google/ads/internal/h; */
		 com.google.ads.AdSize .createAdSize ( p0,p1 );
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {v0, v1, v2}, Lcom/google/ads/internal/h;-><init>(Lcom/google/ads/AdSize;Z)V */
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 58 */
		 /* iget-boolean v0, p0, Lcom/google/ads/internal/h;->c:Z */
	 } // .end method
	 public com.google.ads.AdSize b ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 66 */
		 v0 = this.b;
	 } // .end method
