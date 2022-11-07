public class org.anddev.andengine.entity.sprite.batch.SpriteGroup extends org.anddev.andengine.entity.sprite.batch.SpriteBatch {
	 /* # direct methods */
	 public org.anddev.andengine.entity.sprite.batch.SpriteGroup ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;I)V */
		 int v0 = 0; // const/4 v0, 0x0
		 (( org.anddev.andengine.entity.sprite.batch.SpriteGroup ) p0 ).setChildrenVisible ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->setChildrenVisible(Z)V
		 return;
	 } // .end method
	 private void assertCapacity ( ) {
		 /* .locals 3 */
		 v0 = 		 (( org.anddev.andengine.entity.sprite.batch.SpriteGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->getChildCount()I
		 /* iget v1, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->mCapacity:I */
		 /* if-lt v0, v1, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalStateException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "This SpriteGroup has already reached its capacity ("; // const-string v2, "This SpriteGroup has already reached its capacity ("
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v2, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->mCapacity:I */
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = ") !"; // const-string v2, ") !"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public void attachChild ( org.anddev.andengine.entity.IEntity p0 ) {
	 /* .locals 3 */
	 /* instance-of v1, p1, Lorg/anddev/andengine/entity/sprite/BaseSprite; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->assertCapacity()V */
		 /* move-object v0, p1 */
		 /* check-cast v0, Lorg/anddev/andengine/entity/sprite/BaseSprite; */
		 /* move-object v1, v0 */
		 (( org.anddev.andengine.entity.sprite.BaseSprite ) v1 ).getTextureRegion ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;
		 (( org.anddev.andengine.entity.sprite.batch.SpriteGroup ) p0 ).assertTexture ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->assertTexture(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V */
		 return;
	 } // :cond_0
	 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
	 final String v2 = "A SpriteGroup can only handle children of type BaseSprite or subclasses of BaseSprite, like Sprite, TiledSprite or AnimatedSprite."; // const-string v2, "A SpriteGroup can only handle children of type BaseSprite or subclasses of BaseSprite, like Sprite, TiledSprite or AnimatedSprite."
	 /* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
} // .end method
public void attachChild ( org.anddev.andengine.entity.sprite.BaseSprite p0 ) {
	 /* .locals 1 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->assertCapacity()V */
	 (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getTextureRegion ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;
	 (( org.anddev.andengine.entity.sprite.batch.SpriteGroup ) p0 ).assertTexture ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->assertTexture(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
	 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V */
	 return;
} // .end method
public void attachChildren ( java.util.ArrayList p0 ) {
	 /* .locals 3 */
	 v1 = 	 (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
	 int v0 = 0; // const/4 v0, 0x0
	 /* move v2, v0 */
} // :goto_0
/* if-lt v2, v1, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/sprite/BaseSprite; */
(( org.anddev.andengine.entity.sprite.batch.SpriteGroup ) p0 ).attachChild ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteGroup;->attachChild(Lorg/anddev/andengine/entity/sprite/BaseSprite;)V
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // .end method
protected void onDrawSpriteBatch ( ) {
/* .locals 4 */
v1 = this.mChildren;
v2 = (( org.anddev.andengine.util.SmartList ) v1 ).size ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/SmartList;->size()I
int v0 = 0; // const/4 v0, 0x0
/* move v3, v0 */
} // :goto_0
/* if-lt v3, v2, :cond_0 */
return;
} // :cond_0
(( org.anddev.andengine.util.SmartList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/sprite/BaseSprite; */
/* invoke-super {p0, v0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->drawWithoutChecks(Lorg/anddev/andengine/entity/sprite/BaseSprite;)V */
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // .end method
