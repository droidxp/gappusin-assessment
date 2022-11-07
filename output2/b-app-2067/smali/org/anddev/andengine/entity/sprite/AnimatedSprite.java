public class org.anddev.andengine.entity.sprite.AnimatedSprite extends org.anddev.andengine.entity.sprite.TiledSprite implements org.anddev.andengine.util.constants.TimeConstants {
	 /* # interfaces */
	 /* # static fields */
	 private static final Integer LOOP_CONTINUOUS;
	 /* # instance fields */
	 private Long mAnimationDuration;
	 private org.anddev.andengine.entity.sprite.AnimatedSprite$IAnimationListener mAnimationListener;
	 private Long mAnimationProgress;
	 private Boolean mAnimationRunning;
	 private Integer mFirstTileIndex;
	 private Integer mFrameCount;
	 private mFrameEndsInNanoseconds;
	 private mFrames;
	 private Integer mInitialLoopCount;
	 private Integer mLoopCount;
	 /* # direct methods */
	 public org.anddev.andengine.entity.sprite.AnimatedSprite ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/entity/sprite/TiledSprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.sprite.AnimatedSprite ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p6}, Lorg/anddev/andengine/entity/sprite/TiledSprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.sprite.AnimatedSprite ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/sprite/TiledSprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.sprite.AnimatedSprite ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/sprite/TiledSprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)V */
		 return;
	 } // .end method
	 private Integer calculateCurrentFrameIndex ( ) {
		 /* .locals 7 */
		 /* iget-wide v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationProgress:J */
		 v2 = this.mFrameEndsInNanoseconds;
		 /* iget v3, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mFrameCount:I */
		 int v4 = 0; // const/4 v4, 0x0
	 } // :goto_0
	 /* if-lt v4, v3, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* sub-int v0, v3, v0 */
} // :goto_1
} // :cond_0
/* aget-wide v5, v2, v4 */
/* cmp-long v5, v5, v0 */
/* if-lez v5, :cond_1 */
/* move v0, v4 */
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
} // .end method
private org.anddev.andengine.entity.sprite.AnimatedSprite init ( Long[] p0, Integer p1, Integer[] p2, Integer p3, Integer p4, org.anddev.andengine.entity.sprite.AnimatedSprite$IAnimationListener p5 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
/* iput p2, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mFrameCount:I */
this.mAnimationListener = p6;
/* iput p5, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mInitialLoopCount:I */
/* iput p5, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mLoopCount:I */
this.mFrames = p3;
/* iput p4, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mFirstTileIndex:I */
v0 = this.mFrameEndsInNanoseconds;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mFrameCount:I */
v1 = this.mFrameEndsInNanoseconds;
/* array-length v1, v1 */
/* if-le v0, v1, :cond_1 */
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mFrameCount:I */
/* new-array v0, v0, [J */
this.mFrameEndsInNanoseconds = v0;
} // :cond_1
v0 = this.mFrameEndsInNanoseconds;
/* const-wide/32 v1, 0xf4240 */
org.anddev.andengine.util.MathUtils .arraySumInto ( p1,v0,v1,v2 );
/* iget v1, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mFrameCount:I */
/* sub-int/2addr v1, v3 */
/* aget-wide v0, v0, v1 */
/* iput-wide v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationDuration:J */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationProgress:J */
/* iput-boolean v3, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationRunning:Z */
} // .end method
/* # virtual methods */
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate(JZ)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long p0, Integer p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate(JILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long p0, Integer p1, org.anddev.andengine.entity.sprite.AnimatedSprite$IAnimationListener p2 ) {
/* .locals 1 */
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).getTextureRegion ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
v0 = (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).getTileCount ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileCount()I
/* new-array v0, v0, [J */
java.util.Arrays .fill ( v0,p1,p2 );
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( v0, p3, p4 ); // invoke-virtual {p0, v0, p3, p4}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([JILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long p0, Boolean p1 ) {
/* .locals 2 */
if ( p3 != null) { // if-eqz p3, :cond_0
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate(JILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long p0, Boolean p1, org.anddev.andengine.entity.sprite.AnimatedSprite$IAnimationListener p2 ) {
/* .locals 1 */
if ( p3 != null) { // if-eqz p3, :cond_0
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, p2, v0, p4 ); // invoke-virtual {p0, p1, p2, v0, p4}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate(JILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([JZ)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Integer p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([JILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([JIIILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite; */
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Integer p1, Integer p2, Integer p3, org.anddev.andengine.entity.sprite.AnimatedSprite$IAnimationListener p4 ) {
/* .locals 7 */
/* sub-int v0, p3, p2 */
/* if-gtz v0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "An animation needs at least two tiles to animate between."; // const-string v1, "An animation needs at least two tiles to animate between."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* sub-int v0, p3, p2 */
/* add-int/lit8 v2, v0, 0x1 */
/* array-length v0, p1 */
/* if-eq v0, v2, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "pFrameDurations must have the same length as pFirstTileIndex to pLastTileIndex."; // const-string v1, "pFrameDurations must have the same length as pFirstTileIndex to pLastTileIndex."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v4, p2 */
/* move v5, p4 */
/* move-object v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->init([JI[IIILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite; */
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 6 */
if ( p4 != null) { // if-eqz p4, :cond_0
int v0 = -1; // const/4 v0, -0x1
/* move v4, v0 */
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([JIIILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* move v4, v0 */
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Integer p1, org.anddev.andengine.entity.sprite.AnimatedSprite$IAnimationListener p2 ) {
/* .locals 6 */
int v2 = 0; // const/4 v2, 0x0
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).getTextureRegion ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
v0 = (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).getTileCount ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileCount()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int v3, v0, v1 */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v4, p2 */
/* move-object v5, p3 */
/* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([JIIILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite; */
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Boolean p1 ) {
/* .locals 2 */
if ( p2 != null) { // if-eqz p2, :cond_0
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([JILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Boolean p1, org.anddev.andengine.entity.sprite.AnimatedSprite$IAnimationListener p2 ) {
/* .locals 1 */
if ( p2 != null) { // if-eqz p2, :cond_0
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, v0, p3 ); // invoke-virtual {p0, p1, v0, p3}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([JILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Integer[] p1, Integer p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).animate ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->animate([J[IILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite;
} // .end method
public org.anddev.andengine.entity.sprite.AnimatedSprite animate ( Long[] p0, Integer[] p1, Integer p2, org.anddev.andengine.entity.sprite.AnimatedSprite$IAnimationListener p3 ) {
/* .locals 7 */
/* array-length v2, p2 */
/* array-length v0, p1 */
/* if-eq v0, v2, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "pFrameDurations must have the same length as pFrames."; // const-string v1, "pFrameDurations must have the same length as pFrames."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v3, p2 */
/* move v5, p3 */
/* move-object v6, p4 */
/* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->init([JI[IIILorg/anddev/andengine/entity/sprite/AnimatedSprite$IAnimationListener;)Lorg/anddev/andengine/entity/sprite/AnimatedSprite; */
} // .end method
public Boolean isAnimationRunning ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationRunning:Z */
} // .end method
protected void onManagedUpdate ( Float p0 ) {
/* .locals 5 */
int v4 = -1; // const/4 v4, -0x1
/* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/sprite/TiledSprite;->onManagedUpdate(F)V */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationRunning:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* const v0, 0x4e6e6b28 # 1.0E9f */
/* mul-float/2addr v0, p1 */
/* float-to-long v0, v0 */
/* iget-wide v2, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationProgress:J */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationProgress:J */
/* iget-wide v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationProgress:J */
/* iget-wide v2, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationDuration:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_0 */
/* iget-wide v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationProgress:J */
/* iget-wide v2, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationDuration:J */
/* rem-long/2addr v0, v2 */
/* iput-wide v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationProgress:J */
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mInitialLoopCount:I */
/* if-eq v0, v4, :cond_0 */
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mLoopCount:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mLoopCount:I */
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mInitialLoopCount:I */
/* if-eq v0, v4, :cond_1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mLoopCount:I */
/* if-ltz v0, :cond_4 */
} // :cond_1
v0 = /* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->calculateCurrentFrameIndex()I */
v1 = this.mFrames;
/* if-nez v1, :cond_3 */
/* iget v1, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mFirstTileIndex:I */
/* add-int/2addr v0, v1 */
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).setCurrentTileIndex ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->setCurrentTileIndex(I)V
} // :cond_2
} // :goto_0
return;
} // :cond_3
v1 = this.mFrames;
/* aget v0, v1, v0 */
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).setCurrentTileIndex ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->setCurrentTileIndex(I)V
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationRunning:Z */
v0 = this.mAnimationListener;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.mAnimationListener;
} // .end method
public void stopAnimation ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationRunning:Z */
return;
} // .end method
public void stopAnimation ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->mAnimationRunning:Z */
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) p0 ).setCurrentTileIndex ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->setCurrentTileIndex(I)V
return;
} // .end method
