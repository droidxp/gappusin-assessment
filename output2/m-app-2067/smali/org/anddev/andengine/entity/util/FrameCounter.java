public class org.anddev.andengine.entity.util.FrameCounter implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # instance fields */
	 private Integer mFrames;
	 /* # direct methods */
	 public org.anddev.andengine.entity.util.FrameCounter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getFrames ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/FrameCounter;->mFrames:I */
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/FrameCounter;->mFrames:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FrameCounter;->mFrames:I */
		 return;
	 } // .end method
	 public void reset ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FrameCounter;->mFrames:I */
		 return;
	 } // .end method
