class inal implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private android.content.Context a; //synthetic
	 private Boolean b; //synthetic
	 private com.flurry.android.FlurryAgent c; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 410 */
		 this.c = p1;
		 this.a = p2;
		 /* iput-boolean p3, p0, Lcom/flurry/android/c;->b:Z */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void run ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 412 */
		 v0 = this.c;
		 v1 = this.a;
		 /* iget-boolean v2, p0, Lcom/flurry/android/c;->b:Z */
		 (( com.flurry.android.FlurryAgent ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/flurry/android/FlurryAgent;->a(Landroid/content/Context;Z)V
		 /* .line 413 */
		 return;
	 } // .end method
