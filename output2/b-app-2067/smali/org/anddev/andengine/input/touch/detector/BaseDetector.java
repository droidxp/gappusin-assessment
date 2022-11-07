public abstract class org.anddev.andengine.input.touch.detector.BaseDetector implements org.anddev.andengine.entity.scene.Scene$IOnSceneTouchListener {
	 /* # interfaces */
	 /* # instance fields */
	 private Boolean mEnabled;
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.detector.BaseDetector ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/BaseDetector;->mEnabled:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isEnabled ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/BaseDetector;->mEnabled:Z */
	 } // .end method
	 protected abstract Boolean onManagedTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
	 } // .end method
	 public Boolean onSceneTouchEvent ( org.anddev.andengine.entity.scene.Scene p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.input.touch.detector.BaseDetector ) p0 ).onTouchEvent ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/input/touch/detector/BaseDetector;->onTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z
	 } // .end method
	 public final Boolean onTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/BaseDetector;->mEnabled:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( org.anddev.andengine.input.touch.detector.BaseDetector ) p0 ).onManagedTouchEvent ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/input/touch/detector/BaseDetector;->onManagedTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setEnabled ( Boolean p0 ) {
	 /* .locals 0 */
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/input/touch/detector/BaseDetector;->mEnabled:Z */
	 return;
} // .end method
