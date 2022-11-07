public class org.anddev.andengine.util.progress.ProgressMonitor implements org.anddev.andengine.util.progress.IProgressListener {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.util.progress.IProgressListener mListener;
	 private final org.anddev.andengine.util.progress.ProgressMonitor mParentProgressMonitor;
	 private Integer mProgress;
	 private Integer mSubMonitorRangeFrom;
	 private Integer mSubMonitorRangeTo;
	 /* # direct methods */
	 public org.anddev.andengine.util.progress.ProgressMonitor ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v1, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeFrom:I */
		 /* const/16 v0, 0x64 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeTo:I */
		 /* iput v1, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mProgress:I */
		 this.mListener = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 this.mParentProgressMonitor = v0;
		 return;
	 } // .end method
	 public org.anddev.andengine.util.progress.ProgressMonitor ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v1, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeFrom:I */
		 /* const/16 v0, 0x64 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeTo:I */
		 /* iput v1, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mProgress:I */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mListener = v0;
		 this.mParentProgressMonitor = p1;
		 return;
	 } // .end method
	 private void onSubProgressChanged ( Integer p0 ) {
		 /* .locals 4 */
		 /* move v0, p1 */
		 /* move-object v1, p0 */
	 } // :goto_0
	 /* iget v2, v1, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeTo:I */
	 /* iget v3, v1, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeFrom:I */
	 /* sub-int/2addr v2, v3 */
	 /* iget v3, v1, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeFrom:I */
	 /* mul-int/2addr v0, v2 */
	 /* int-to-float v0, v0 */
	 /* const/high16 v2, 0x42c80000 # 100.0f */
	 /* div-float/2addr v0, v2 */
	 /* float-to-int v0, v0 */
	 /* add-int/2addr v0, v3 */
	 v2 = this.mParentProgressMonitor;
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 v1 = this.mParentProgressMonitor;
	 } // :cond_0
	 v1 = this.mListener;
	 return;
} // .end method
/* # virtual methods */
public org.anddev.andengine.util.progress.ProgressMonitor getParentProgressMonitor ( ) {
	 /* .locals 1 */
	 v0 = this.mParentProgressMonitor;
} // .end method
public Integer getProgress ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mProgress:I */
} // .end method
public void onProgressChanged ( Integer p0 ) {
	 /* .locals 1 */
	 /* iput p1, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mProgress:I */
	 v0 = this.mParentProgressMonitor;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mParentProgressMonitor;
		 /* invoke-direct {v0, p1}, Lorg/anddev/andengine/util/progress/ProgressMonitor;->onSubProgressChanged(I)V */
	 } // :goto_0
	 return;
} // :cond_0
v0 = this.mListener;
} // .end method
public void setSubMonitorRange ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeFrom:I */
/* iput p2, p0, Lorg/anddev/andengine/util/progress/ProgressMonitor;->mSubMonitorRangeTo:I */
return;
} // .end method
