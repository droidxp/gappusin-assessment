public abstract class org.anddev.andengine.opengl.texture.atlas.TextureAtlas extends org.anddev.andengine.opengl.texture.Texture implements org.anddev.andengine.opengl.texture.atlas.ITextureAtlas {
	 /* # interfaces */
	 /* # instance fields */
	 protected final Integer mHeight;
	 protected final java.util.ArrayList mTextureAtlasSources;
	 protected final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.TextureAtlas ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p3, p4, p5}, Lorg/anddev/andengine/opengl/texture/Texture;-><init>(Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTextureAtlasSources = v0;
		 v0 = 		 org.anddev.andengine.util.MathUtils .isPowerOfTwo ( p1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 org.anddev.andengine.util.MathUtils .isPowerOfTwo ( p2 );
			 /* if-nez v0, :cond_1 */
		 } // :cond_0
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "pWidth and pHeight must be a power of 2!"; // const-string v1, "pWidth and pHeight must be a power of 2!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_1
	 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->mWidth:I */
	 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->mHeight:I */
	 return;
} // .end method
private void checkTextureAtlasSourcePosition ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0, Integer p1, Integer p2 ) {
	 /* .locals 3 */
	 /* if-gez p2, :cond_0 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Illegal negative pTexturePositionX supplied: \'"; // const-string v2, "Illegal negative pTexturePositionX supplied: \'"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = "\'"; // const-string v2, "\'"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
/* if-gez p3, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Illegal negative pTexturePositionY supplied: \'"; // const-string v2, "Illegal negative pTexturePositionY supplied: \'"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "\'"; // const-string v2, "\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
v0 = } // :cond_1
/* add-int/2addr v0, p2 */
v1 = (( org.anddev.andengine.opengl.texture.atlas.TextureAtlas ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->getWidth()I
v0 = /* if-gt v0, v1, :cond_2 */
/* add-int/2addr v0, p3 */
v1 = (( org.anddev.andengine.opengl.texture.atlas.TextureAtlas ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->getHeight()I
/* if-le v0, v1, :cond_3 */
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Supplied pTextureAtlasSource must not exceed bounds of Texture."; // const-string v1, "Supplied pTextureAtlasSource must not exceed bounds of Texture."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_3
return;
} // .end method
/* # virtual methods */
public void addTextureAtlasSource ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->checkTextureAtlasSourcePosition(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;II)V */
v0 = this.mTextureAtlasSources;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->mUpdateOnHardwareNeeded:Z */
return;
} // .end method
public void clearTextureAtlasSources ( ) {
/* .locals 1 */
v0 = this.mTextureAtlasSources;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->mUpdateOnHardwareNeeded:Z */
return;
} // .end method
public Integer getHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->mHeight:I */
} // .end method
public org.anddev.andengine.opengl.texture.ITexture$ITextureStateListener getTextureStateListener ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.opengl.texture.atlas.TextureAtlas ) p0 ).getTextureStateListener ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->getTextureStateListener()Lorg/anddev/andengine/opengl/texture/atlas/ITextureAtlas$ITextureAtlasStateListener;
} // .end method
public org.anddev.andengine.opengl.texture.atlas.ITextureAtlas$ITextureAtlasStateListener getTextureStateListener ( ) {
/* .locals 0 */
/* invoke-super {p0}, Lorg/anddev/andengine/opengl/texture/Texture;->getTextureStateListener()Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener; */
/* check-cast p0, Lorg/anddev/andengine/opengl/texture/atlas/ITextureAtlas$ITextureAtlasStateListener; */
} // .end method
public Integer getWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->mWidth:I */
} // .end method
public void removeTextureAtlasSource ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0, Integer p1, Integer p2 ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
v1 = this.mTextureAtlasSources;
v0 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v0, v4 */
/* move v2, v0 */
} // :goto_0
/* if-gez v2, :cond_0 */
} // :goto_1
return;
} // :cond_0
(( java.util.ArrayList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource; */
v3 = /* if-ne v0, p1, :cond_1 */
v0 = /* if-ne v3, p2, :cond_1 */
/* if-ne v0, p3, :cond_1 */
(( java.util.ArrayList ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* iput-boolean v4, p0, Lorg/anddev/andengine/opengl/texture/atlas/TextureAtlas;->mUpdateOnHardwareNeeded:Z */
} // :cond_1
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
} // .end method
