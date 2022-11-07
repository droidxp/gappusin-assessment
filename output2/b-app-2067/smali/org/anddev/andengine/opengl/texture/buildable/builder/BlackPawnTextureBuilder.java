public class org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder implements org.anddev.andengine.opengl.texture.buildable.builder.ITextureBuilder {
	 /* # interfaces */
	 /* # static fields */
	 private static final java.util.Comparator TEXTURESOURCE_COMPARATOR;
	 /* # instance fields */
	 private final Integer mTextureAtlasSourceSpacing;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$1; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$1;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder;->mTextureAtlasSourceSpacing:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void pack ( org.anddev.andengine.opengl.texture.atlas.ITextureAtlas p0, java.util.ArrayList p1 ) {
		 /* .locals 8 */
		 int v4 = 0; // const/4 v4, 0x0
		 v0 = org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder.TEXTURESOURCE_COMPARATOR;
		 java.util.Collections .sort ( p2,v0 );
		 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node; */
		 v3 = 		 v2 = 		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect; */
		 /* invoke-direct {v0, v4, v4, v2, v3}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;-><init>(IIII)V */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;-><init>(Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;)V */
		 v2 = 		 (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
		 /* move v3, v4 */
	 } // :goto_0
	 /* if-lt v3, v2, :cond_0 */
	 return;
} // :cond_0
(( java.util.ArrayList ) p2 ).get ( v3 ); // invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback; */
v6 = v5 = (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback ) v0 ).getTextureAtlasSource ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;->getTextureAtlasSource()Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;
/* iget v7, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder;->mTextureAtlasSourceSpacing:I */
(( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node ) v1 ).insert ( v4, v5, v6, v7 ); // invoke-virtual {v1, v4, v5, v6, v7}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;->insert(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;III)Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;
/* if-nez v5, :cond_1 */
/* new-instance v0, Lorg/anddev/andengine/opengl/texture/buildable/builder/ITextureBuilder$TextureAtlasSourcePackingException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Could not pack: "; // const-string v2, "Could not pack: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Object ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/anddev/andengine/opengl/texture/buildable/builder/ITextureBuilder$TextureAtlasSourcePackingException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node .access$0 ( v5 );
v6 = org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect .access$0 ( v6 );
org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node .access$0 ( v5 );
v5 = org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect .access$1 ( v5 );
(( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback ) v0 ).getCallback ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;->getCallback()Lorg/anddev/andengine/util/Callback;
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // .end method
