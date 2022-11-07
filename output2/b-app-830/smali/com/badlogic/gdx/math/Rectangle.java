public class com.badlogic.gdx.math.Rectangle implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 public Float height;
	 public Float width;
	 public Float x;
	 public Float y;
	 /* # direct methods */
	 public com.badlogic.gdx.math.Rectangle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Rectangle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
		 /* iput p2, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
		 /* iput p3, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
		 /* iput p4, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Rectangle ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->width:F */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->height:F */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean contains ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
		 /* cmpg-float v0, v0, p1 */
		 /* if-gez v0, :cond_0 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
		 /* add-float/2addr v0, v1 */
		 /* cmpl-float v0, v0, p1 */
		 /* if-lez v0, :cond_0 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
		 /* cmpg-float v0, v0, p2 */
		 /* if-gez v0, :cond_0 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
		 /* add-float/2addr v0, v1 */
		 /* cmpl-float v0, v0, p2 */
		 /* if-lez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean contains ( com.badlogic.gdx.math.Rectangle p0 ) {
/* .locals 6 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v1, v0 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v3, v2 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* cmpl-float v4, v0, v4 */
/* if-lez v4, :cond_0 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v5, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v4, v5 */
/* cmpg-float v0, v0, v4 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* cmpl-float v0, v1, v0 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v4, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v0, v4 */
/* cmpg-float v0, v1, v0 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* cmpl-float v0, v2, v0 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v0, v1 */
/* cmpg-float v0, v2, v0 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* cmpl-float v0, v3, v0 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v0, v1 */
/* cmpg-float v0, v3, v0 */
/* if-gez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Float getHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
} // .end method
public Float getWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
} // .end method
public Float getX ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
} // .end method
public Float getY ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
} // .end method
public void merge ( com.badlogic.gdx.math.Rectangle p0 ) {
/* .locals 4 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
v0 = java.lang.Math .min ( v0,v1 );
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v2, v3 */
v1 = java.lang.Math .max ( v1,v2 );
/* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* sub-float v0, v1, v0 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
v0 = java.lang.Math .min ( v0,v1 );
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v2, v3 */
v1 = java.lang.Math .max ( v1,v2 );
/* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* sub-float v0, v1, v0 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
return;
} // .end method
public Boolean overlaps ( com.badlogic.gdx.math.Rectangle p0 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v1, v2 */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v1, v2 */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void set ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iput p2, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iput p3, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* iput p4, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
return;
} // .end method
public void set ( com.badlogic.gdx.math.Rectangle p0 ) {
/* .locals 1 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* iput v0, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
return;
} // .end method
public void setHeight ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
return;
} // .end method
public void setWidth ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
return;
} // .end method
public void setX ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
return;
} // .end method
public void setY ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
final String v2 = ","; // const-string v2, ","
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
