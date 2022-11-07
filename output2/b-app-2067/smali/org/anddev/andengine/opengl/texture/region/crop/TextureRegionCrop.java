public class org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop {
	 /* # static fields */
	 private static final Integer BOTTOM_INDEX;
	 private static final Integer HEIGHT_INDEX;
	 private static final Integer LEFT_INDEX;
	 private static final Integer WIDTH_INDEX;
	 /* # instance fields */
	 private final mData;
	 private Boolean mDirty;
	 private Boolean mFlippedHorizontal;
	 private Boolean mFlippedVertical;
	 protected final org.anddev.andengine.opengl.texture.region.BaseTextureRegion mTextureRegion;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [I */
		 this.mData = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mDirty:Z */
		 this.mTextureRegion = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void apply ( javax.microedition.khronos.opengles.GL11 p0 ) {
		 /* .locals 0 */
		 org.anddev.andengine.opengl.util.GLHelper .textureCrop ( p1,p0 );
		 return;
	 } // .end method
	 public getData ( ) {
		 /* .locals 1 */
		 v0 = this.mData;
	 } // .end method
	 public Boolean isDirty ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mDirty:Z */
	 } // .end method
	 public Boolean isFlippedHorizontal ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mFlippedHorizontal:Z */
	 } // .end method
	 public Boolean isFlippedVertical ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mFlippedVertical:Z */
	 } // .end method
	 public void selectOnHardware ( javax.microedition.khronos.opengles.GL11 p0 ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mDirty:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mDirty:Z */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 org.anddev.andengine.opengl.util.GLHelper .textureCrop ( p1,p0 );
				 /* monitor-exit p0 */
			 } // :cond_0
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw v0 */
		 } // .end method
		 public void setFlippedHorizontal ( Boolean p0 ) {
			 /* .locals 1 */
			 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mFlippedHorizontal:Z */
			 /* if-eq v0, p1, :cond_0 */
			 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mFlippedHorizontal:Z */
			 (( org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ) p0 ).update ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->update()V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setFlippedVertical ( Boolean p0 ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mFlippedVertical:Z */
		 /* if-eq v0, p1, :cond_0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mFlippedVertical:Z */
		 (( org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ) p0 ).update ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->update()V
	 } // :cond_0
	 return;
} // .end method
public void update ( ) {
	 /* .locals 7 */
	 int v6 = 1; // const/4 v6, 0x1
	 v0 = this.mTextureRegion;
	 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTexture ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTexture()Lorg/anddev/andengine/opengl/texture/ITexture;
	 /* if-nez v1, :cond_0 */
} // :goto_0
return;
} // :cond_0
v1 = this.mData;
v2 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureCropLeft ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCropLeft()I
v3 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureCropTop ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCropTop()I
v4 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureCropWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCropWidth()I
v0 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureCropHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCropHeight()I
/* iget-boolean v5, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mFlippedVertical:Z */
/* if-nez v5, :cond_1 */
/* iget-boolean v5, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mFlippedHorizontal:Z */
/* if-nez v5, :cond_1 */
int v5 = 0; // const/4 v5, 0x0
/* aput v2, v1, v5 */
/* add-int v2, v3, v0 */
/* aput v2, v1, v6 */
int v2 = 2; // const/4 v2, 0x2
/* aput v4, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
/* neg-int v0, v0 */
/* aput v0, v1, v2 */
} // :cond_1
/* iput-boolean v6, p0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->mDirty:Z */
} // .end method
