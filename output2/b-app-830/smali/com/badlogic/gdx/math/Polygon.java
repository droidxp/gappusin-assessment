public class com.badlogic.gdx.math.Polygon {
	 /* # instance fields */
	 private com.badlogic.gdx.math.Rectangle bounds;
	 private Boolean dirty;
	 private Float originX;
	 private Float originY;
	 private Float rotation;
	 private Float scaleX;
	 private Float scaleY;
	 private final vertices;
	 private Float x;
	 private Float y;
	 /* # direct methods */
	 public com.badlogic.gdx.math.Polygon ( ) {
		 /* .locals 2 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Polygon;->scaleX:F */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Polygon;->scaleY:F */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Rectangle; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Rectangle;-><init>()V */
		 this.bounds = v0;
		 /* array-length v0, p1 */
		 int v1 = 6; // const/4 v1, 0x6
		 /* if-ge v0, v1, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "polygons must contain at least 3 points."; // const-string v1, "polygons must contain at least 3 points."
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 this.vertices = p1;
	 return;
} // .end method
/* # virtual methods */
public Float area ( ) {
	 /* .locals 9 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.badlogic.gdx.math.Polygon ) p0 ).getVertices ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Polygon;->getVertices()[F
	 /* array-length v2, v1 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* move v8, v3 */
	 /* move v3, v0 */
	 /* move v0, v8 */
} // :goto_0
/* if-ge v0, v2, :cond_0 */
/* add-int/lit8 v4, v0, 0x1 */
/* add-int/lit8 v5, v0, 0x2 */
/* rem-int/2addr v5, v2 */
/* add-int/lit8 v6, v0, 0x3 */
/* rem-int/2addr v6, v2 */
/* aget v7, v1, v0 */
/* aget v6, v1, v6 */
/* mul-float/2addr v6, v7 */
/* add-float/2addr v3, v6 */
/* aget v5, v1, v5 */
/* aget v4, v1, v4 */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* add-int/lit8 v0, v0, 0x2 */
} // :cond_0
/* const/high16 v0, 0x3f000000 # 0.5f */
/* mul-float/2addr v0, v3 */
} // .end method
public Boolean contains ( Float p0, Float p1 ) {
/* .locals 11 */
int v10 = 1; // const/4 v10, 0x1
int v9 = 0; // const/4 v9, 0x0
(( com.badlogic.gdx.math.Polygon ) p0 ).getVertices ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Polygon;->getVertices()[F
/* array-length v1, v0 */
/* move v2, v9 */
/* move v3, v9 */
} // :goto_0
/* if-ge v2, v1, :cond_3 */
/* aget v4, v0, v2 */
/* add-int/lit8 v5, v2, 0x1 */
/* aget v5, v0, v5 */
/* add-int/lit8 v6, v2, 0x2 */
/* rem-int/2addr v6, v1 */
/* aget v6, v0, v6 */
/* add-int/lit8 v7, v2, 0x3 */
/* rem-int/2addr v7, v1 */
/* aget v7, v0, v7 */
/* cmpg-float v8, v5, p2 */
/* if-gtz v8, :cond_0 */
/* cmpg-float v8, p2, v7 */
/* if-ltz v8, :cond_1 */
} // :cond_0
/* cmpg-float v8, v7, p2 */
/* if-gtz v8, :cond_2 */
/* cmpg-float v8, p2, v5 */
/* if-gez v8, :cond_2 */
} // :cond_1
/* sub-float/2addr v6, v4 */
/* sub-float/2addr v7, v5 */
/* div-float/2addr v6, v7 */
/* sub-float v5, p2, v5 */
/* mul-float/2addr v5, v6 */
/* add-float/2addr v4, v5 */
/* cmpg-float v4, p1, v4 */
/* if-gez v4, :cond_2 */
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x2 */
} // :cond_3
/* and-int/lit8 v0, v3, 0x1 */
/* if-ne v0, v10, :cond_4 */
/* move v0, v10 */
} // :goto_1
} // :cond_4
/* move v0, v9 */
} // .end method
public com.badlogic.gdx.math.Rectangle getBoundingRectangle ( ) {
/* .locals 10 */
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
(( com.badlogic.gdx.math.Polygon ) p0 ).getVertices ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Polygon;->getVertices()[F
/* aget v1, v0, v3 */
/* aget v2, v0, v4 */
/* aget v3, v0, v3 */
/* aget v4, v0, v4 */
/* array-length v5, v0 */
int v6 = 2; // const/4 v6, 0x2
/* move v8, v6 */
/* move v6, v1 */
/* move v1, v8 */
/* move v9, v2 */
/* move v2, v4 */
/* move v4, v9 */
} // :goto_0
/* if-ge v1, v5, :cond_4 */
/* aget v7, v0, v1 */
/* cmpl-float v7, v6, v7 */
/* if-lez v7, :cond_0 */
/* aget v6, v0, v1 */
} // :cond_0
/* add-int/lit8 v7, v1, 0x1 */
/* aget v7, v0, v7 */
/* cmpl-float v7, v4, v7 */
/* if-lez v7, :cond_1 */
/* add-int/lit8 v4, v1, 0x1 */
/* aget v4, v0, v4 */
} // :cond_1
/* aget v7, v0, v1 */
/* cmpg-float v7, v3, v7 */
/* if-gez v7, :cond_2 */
/* aget v3, v0, v1 */
} // :cond_2
/* add-int/lit8 v7, v1, 0x1 */
/* aget v7, v0, v7 */
/* cmpg-float v7, v2, v7 */
/* if-gez v7, :cond_3 */
/* add-int/lit8 v2, v1, 0x1 */
/* aget v2, v0, v2 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x2 */
} // :cond_4
v0 = this.bounds;
/* iput v6, v0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
v0 = this.bounds;
/* iput v4, v0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
v0 = this.bounds;
/* sub-float v1, v3, v6 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
v0 = this.bounds;
/* sub-float v1, v2, v4 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
v0 = this.bounds;
} // .end method
public Float getOriginX ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->originX:F */
} // .end method
public Float getOriginY ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->originY:F */
} // .end method
public Float getRotation ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->rotation:F */
} // .end method
public Float getScaleX ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->scaleX:F */
} // .end method
public Float getScaleY ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->scaleY:F */
} // .end method
public getVertices ( ) {
/* .locals 14 */
int v12 = 0; // const/4 v12, 0x0
/* const/high16 v11, 0x3f800000 # 1.0f */
/* iget-boolean v0, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
/* if-nez v0, :cond_0 */
v0 = this.vertices;
} // :goto_0
} // :cond_0
v0 = this.vertices;
/* array-length v1, v0 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Polygon;->x:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Polygon;->originX:F */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Polygon;->y:F */
/* iget v4, p0, Lcom/badlogic/gdx/math/Polygon;->originY:F */
/* add-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Polygon;->rotation:F */
v4 = com.badlogic.gdx.math.MathUtils .cosDeg ( v4 );
/* iget v5, p0, Lcom/badlogic/gdx/math/Polygon;->rotation:F */
v5 = com.badlogic.gdx.math.MathUtils .sinDeg ( v5 );
/* move v6, v12 */
} // :goto_1
/* if-ge v6, v1, :cond_3 */
/* aget v7, v0, v6 */
/* add-int/lit8 v8, v6, 0x1 */
/* aget v8, v0, v8 */
/* sub-float/2addr v7, v2 */
/* sub-float/2addr v8, v3 */
/* iget v9, p0, Lcom/badlogic/gdx/math/Polygon;->scaleX:F */
/* cmpl-float v9, v9, v11 */
/* if-nez v9, :cond_1 */
/* iget v9, p0, Lcom/badlogic/gdx/math/Polygon;->scaleY:F */
/* cmpl-float v9, v9, v11 */
if ( v9 != null) { // if-eqz v9, :cond_4
} // :cond_1
/* iget v9, p0, Lcom/badlogic/gdx/math/Polygon;->scaleX:F */
/* mul-float/2addr v7, v9 */
/* iget v9, p0, Lcom/badlogic/gdx/math/Polygon;->scaleY:F */
/* mul-float/2addr v8, v9 */
/* move v13, v8 */
/* move v8, v7 */
/* move v7, v13 */
} // :goto_2
/* iget v9, p0, Lcom/badlogic/gdx/math/Polygon;->rotation:F */
int v10 = 0; // const/4 v10, 0x0
/* cmpl-float v9, v9, v10 */
if ( v9 != null) { // if-eqz v9, :cond_2
/* mul-float/2addr v8, v4 */
/* mul-float v9, v5, v7 */
/* sub-float/2addr v8, v9 */
/* mul-float v9, v5, v8 */
/* mul-float/2addr v7, v4 */
/* add-float/2addr v7, v9 */
} // :cond_2
/* add-float/2addr v8, v2 */
/* add-float/2addr v7, v3 */
/* aput v8, v0, v6 */
/* add-int/lit8 v8, v6, 0x1 */
/* aput v7, v0, v8 */
/* add-int/lit8 v6, v6, 0x2 */
} // :cond_3
/* iput-boolean v12, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
} // :cond_4
/* move v13, v8 */
/* move v8, v7 */
/* move v7, v13 */
} // .end method
public Float getX ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->x:F */
} // .end method
public Float getY ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->y:F */
} // .end method
public void rotate ( Float p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->rotation:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Polygon;->rotation:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
return;
} // .end method
public void scale ( Float p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->scaleX:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Polygon;->scaleX:F */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->scaleY:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Polygon;->scaleY:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
return;
} // .end method
public void setOrigin ( Float p0, Float p1 ) {
/* .locals 1 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Polygon;->originX:F */
/* iput p2, p0, Lcom/badlogic/gdx/math/Polygon;->originY:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
return;
} // .end method
public void setPosition ( Float p0, Float p1 ) {
/* .locals 1 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Polygon;->x:F */
/* iput p2, p0, Lcom/badlogic/gdx/math/Polygon;->y:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
return;
} // .end method
public void setRotation ( Float p0 ) {
/* .locals 1 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Polygon;->rotation:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
return;
} // .end method
public void setScale ( Float p0, Float p1 ) {
/* .locals 1 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Polygon;->scaleX:F */
/* iput p2, p0, Lcom/badlogic/gdx/math/Polygon;->scaleY:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
return;
} // .end method
public void translate ( Float p0, Float p1 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->x:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Polygon;->x:F */
/* iget v0, p0, Lcom/badlogic/gdx/math/Polygon;->y:F */
/* add-float/2addr v0, p2 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Polygon;->y:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/Polygon;->dirty:Z */
return;
} // .end method
