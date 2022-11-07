public class org.anddev.andengine.entity.util.FrameCountCrasher implements org.anddev.andengine.engine.handler.IUpdateHandler implements org.anddev.andengine.util.constants.TimeConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final mFrameLengths;
	 private Integer mFramesLeft;
	 /* # direct methods */
	 public org.anddev.andengine.entity.util.FrameCountCrasher ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/util/FrameCountCrasher;->mFramesLeft:I */
		 /* new-array v0, p1, [F */
		 this.mFrameLengths = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onUpdate ( Float p0 ) {
		 /* .locals 4 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/FrameCountCrasher;->mFramesLeft:I */
		 /* sub-int/2addr v0, v2 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FrameCountCrasher;->mFramesLeft:I */
		 v0 = this.mFrameLengths;
		 /* iget v1, p0, Lorg/anddev/andengine/entity/util/FrameCountCrasher;->mFramesLeft:I */
		 /* if-ltz v1, :cond_0 */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/util/FrameCountCrasher;->mFramesLeft:I */
		 /* aput p1, v0, v1 */
		 return;
	 } // :cond_0
	 /* array-length v1, v0 */
	 /* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_1 */
/* new-instance v0, Ljava/lang/RuntimeException; */
/* invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V */
/* throw v0 */
} // :cond_1
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Elapsed: "; // const-string v3, "Elapsed: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* aget v3, v0, v1 */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.anddev.andengine.util.Debug .d ( v2 );
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public void reset ( ) {
/* .locals 0 */
return;
} // .end method
