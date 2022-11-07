public class org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node {
	 /* # instance fields */
	 private org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node mChildA;
	 private org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node mChildB;
	 private final org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect mRect;
	 private org.anddev.andengine.opengl.texture.source.ITextureAtlasSource mTextureAtlasSource;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect; */
		 /* invoke-direct {v0, p1, p2, p3, p4}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;-><init>(IIII)V */
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;-><init>(Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mRect = p1;
		 return;
	 } // .end method
	 static org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect access$0 ( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.mRect;
	 } // .end method
	 private org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node createChildren ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
		 /* .locals 6 */
		 v0 = this.mRect;
		 /* if-lt p5, p6, :cond_0 */
		 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node; */
		 v2 = 		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getLeft ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getLeft()I
		 v4 = 		 v3 = 		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getTop ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getTop()I
		 /* add-int/2addr v4, p4 */
		 v5 = 		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getHeight()I
		 /* invoke-direct {v1, v2, v3, v4, v5}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;-><init>(IIII)V */
		 this.mChildA = v1;
		 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node; */
		 v3 = 		 v2 = 		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getLeft ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getLeft()I
		 /* add-int/2addr v3, p4 */
		 /* add-int/2addr v2, v3 */
		 v3 = 		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getTop ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getTop()I
		 v5 = 		 v4 = 		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getWidth()I
		 /* add-int/2addr v5, p4 */
		 /* sub-int/2addr v4, v5 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getHeight()I
		 /* invoke-direct {v1, v2, v3, v4, v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;-><init>(IIII)V */
		 this.mChildB = v1;
	 } // :goto_0
	 v0 = this.mChildA;
	 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node ) v0 ).insert ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;->insert(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;III)Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;
} // :cond_0
/* new-instance v1, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node; */
v2 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getLeft ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getLeft()I
v3 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getTop ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getTop()I
v5 = v4 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getWidth()I
/* add-int/2addr v5, p4 */
/* invoke-direct {v1, v2, v3, v4, v5}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;-><init>(IIII)V */
this.mChildA = v1;
/* new-instance v1, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node; */
v2 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getLeft ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getLeft()I
v4 = v3 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getTop ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getTop()I
/* add-int/2addr v4, p4 */
/* add-int/2addr v3, v4 */
v4 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getWidth()I
v5 = v0 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getHeight()I
/* add-int/2addr v5, p4 */
/* sub-int/2addr v0, v5 */
/* invoke-direct {v1, v2, v3, v4, v0}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;-><init>(IIII)V */
this.mChildB = v1;
} // .end method
/* # virtual methods */
public org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node getChildA ( ) {
/* .locals 1 */
v0 = this.mChildA;
} // .end method
public org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node getChildB ( ) {
/* .locals 1 */
v0 = this.mChildB;
} // .end method
public org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect getRect ( ) {
/* .locals 1 */
v0 = this.mRect;
} // .end method
public org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node insert ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 11 */
int v10 = 1; // const/4 v10, 0x1
int v9 = 0; // const/4 v9, 0x0
int v8 = 0; // const/4 v8, 0x0
v0 = this.mChildA;
if ( v0 != null) { // if-eqz v0, :cond_1
	 v0 = this.mChildB;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.mChildA;
		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node ) v0 ).insert ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;->insert(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;III)Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 v0 = this.mChildB;
	 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Node ) v0 ).insert ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;->insert(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;III)Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;
} // :cond_1
v0 = this.mTextureAtlasSource;
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* move-object v0, v8 */
v1 = v0 = } // :cond_2
v2 = this.mRect;
v2 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getWidth()I
v3 = this.mRect;
v3 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v3 ).getHeight ( ); // invoke-virtual {v3}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getHeight()I
/* if-gt v0, v2, :cond_3 */
/* if-le v1, v3, :cond_4 */
} // :cond_3
/* move-object v0, v8 */
} // :cond_4
/* add-int v4, v0, p4 */
/* add-int v6, v1, p4 */
v5 = this.mRect;
v5 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v5 ).getLeft ( ); // invoke-virtual {v5}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getLeft()I
v7 = this.mRect;
v7 = (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ) v7 ).getTop ( ); // invoke-virtual {v7}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->getTop()I
/* if-ne v1, v3, :cond_5 */
/* add-int/2addr v7, v1 */
/* if-ne v7, p3, :cond_5 */
/* move v7, v10 */
} // :goto_1
/* if-ne v0, v2, :cond_6 */
/* add-int/2addr v5, v0 */
/* if-ne v5, p2, :cond_6 */
/* move v5, v10 */
} // :goto_2
/* if-ne v4, v2, :cond_8 */
/* if-ne v6, v3, :cond_7 */
this.mTextureAtlasSource = p1;
/* move-object v0, p0 */
} // :cond_5
/* move v7, v9 */
} // :cond_6
/* move v5, v9 */
} // :cond_7
if ( v7 != null) { // if-eqz v7, :cond_8
this.mTextureAtlasSource = p1;
/* move-object v0, p0 */
} // :cond_8
if ( v5 != null) { // if-eqz v5, :cond_c
/* if-ne v6, v3, :cond_9 */
this.mTextureAtlasSource = p1;
/* move-object v0, p0 */
} // :cond_9
if ( v7 != null) { // if-eqz v7, :cond_a
this.mTextureAtlasSource = p1;
/* move-object v0, p0 */
} // :cond_a
/* if-le v6, v3, :cond_b */
/* move-object v0, v8 */
} // :cond_b
/* sub-int v5, v2, v0 */
/* sub-int v6, v3, v6 */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;->createChildren(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;IIIII)Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node; */
} // :cond_c
if ( v7 != null) { // if-eqz v7, :cond_f
/* if-ne v4, v2, :cond_d */
this.mTextureAtlasSource = p1;
/* move-object v0, p0 */
} // :cond_d
/* if-le v4, v2, :cond_e */
/* move-object v0, v8 */
/* goto/16 :goto_0 */
} // :cond_e
/* sub-int v5, v2, v4 */
/* sub-int v6, v3, v1 */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;->createChildren(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;IIIII)Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node; */
/* goto/16 :goto_0 */
} // :cond_f
/* if-gt v4, v2, :cond_10 */
/* if-le v6, v3, :cond_11 */
} // :cond_10
/* move-object v0, v8 */
/* goto/16 :goto_0 */
} // :cond_11
/* sub-int v5, v2, v4 */
/* sub-int v6, v3, v6 */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node;->createChildren(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;IIIII)Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Node; */
/* goto/16 :goto_0 */
} // .end method
