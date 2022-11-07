public class com.badlogic.gdx.math.collision.BoundingBox implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 final com.badlogic.gdx.math.Vector3 cnt;
	 final com.badlogic.gdx.math.Vector3 crn;
	 Boolean crn_dirty;
	 final com.badlogic.gdx.math.Vector3 dim;
	 public final com.badlogic.gdx.math.Vector3 max;
	 public final com.badlogic.gdx.math.Vector3 min;
	 /* # direct methods */
	 public com.badlogic.gdx.math.collision.BoundingBox ( ) {
		 /* .locals 4 */
		 /* const/16 v3, 0x8 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v3, [Lcom/badlogic/gdx/math/Vector3; */
		 this.crn = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.min = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.max = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.cnt = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.dim = v0;
		 /* iput-boolean v1, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
		 /* iput-boolean v1, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* if-ge v0, v3, :cond_0 */
	 v1 = this.crn;
	 /* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
	 /* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
	 /* aput-object v2, v1, v0 */
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).clr ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/collision/BoundingBox;->clr()Lcom/badlogic/gdx/math/collision/BoundingBox;
return;
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox ( ) {
/* .locals 4 */
/* const/16 v3, 0x8 */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-array v0, v3, [Lcom/badlogic/gdx/math/Vector3; */
this.crn = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
this.min = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
this.max = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
this.cnt = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
this.dim = v0;
/* iput-boolean v1, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
/* iput-boolean v1, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v3, :cond_0 */
v1 = this.crn;
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).set ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/badlogic/gdx/math/collision/BoundingBox;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
return;
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox ( ) {
/* .locals 4 */
/* const/16 v3, 0x8 */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-array v0, v3, [Lcom/badlogic/gdx/math/Vector3; */
this.crn = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
this.min = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
this.max = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
this.cnt = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
this.dim = v0;
/* iput-boolean v1, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
/* iput-boolean v1, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v3, :cond_0 */
v1 = this.crn;
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).set ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/collision/BoundingBox;->set(Lcom/badlogic/gdx/math/collision/BoundingBox;)Lcom/badlogic/gdx/math/collision/BoundingBox;
return;
} // .end method
static Float max ( Float p0, Float p1 ) {
/* .locals 1 */
/* cmpl-float v0, p0, p1 */
/* if-lez v0, :cond_0 */
/* move v0, p0 */
} // :goto_0
} // :cond_0
/* move v0, p1 */
} // .end method
static Float min ( Float p0, Float p1 ) {
/* .locals 1 */
/* cmpl-float v0, p0, p1 */
/* if-lez v0, :cond_0 */
/* move v0, p1 */
} // :goto_0
} // :cond_0
/* move v0, p0 */
} // .end method
/* # virtual methods */
public com.badlogic.gdx.math.collision.BoundingBox clr ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
v0 = this.min;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v2, v2, v2 ); // invoke-virtual {v0, v2, v2, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = this.max;
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v2, v2 ); // invoke-virtual {v1, v2, v2, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).set ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/badlogic/gdx/math/collision/BoundingBox;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
} // .end method
public Boolean contains ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* move v0, v2 */
} // :goto_0
} // :cond_0
v0 = this.max;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1 */
/* move v0, v2 */
} // :cond_1
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* move v0, v2 */
} // :cond_2
v0 = this.max;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_3 */
/* move v0, v2 */
} // :cond_3
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_4 */
/* move v0, v2 */
} // :cond_4
v0 = this.max;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_5 */
/* move v0, v2 */
} // :cond_5
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean contains ( com.badlogic.gdx.math.collision.BoundingBox p0 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = (( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).isValid ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/collision/BoundingBox;->isValid()Z
/* if-nez v0, :cond_0 */
/* move v0, v3 */
} // :goto_0
} // :cond_0
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->x:F */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_1 */
/* move v0, v2 */
} // :cond_1
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->y:F */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* move v0, v2 */
} // :cond_2
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->z:F */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_3 */
/* move v0, v2 */
} // :cond_3
v0 = this.max;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->x:F */
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_4 */
/* move v0, v2 */
} // :cond_4
v0 = this.max;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->y:F */
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_5 */
/* move v0, v2 */
} // :cond_5
v0 = this.max;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->z:F */
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_6 */
/* move v0, v2 */
} // :cond_6
/* move v0, v3 */
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox ext ( Float p0, Float p1, Float p2 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
v0 = this.min;
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v1 = com.badlogic.gdx.math.collision.BoundingBox .min ( v1,p1 );
v2 = this.min;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v2 = com.badlogic.gdx.math.collision.BoundingBox .min ( v2,p2 );
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
v3 = com.badlogic.gdx.math.collision.BoundingBox .min ( v3,p3 );
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = this.max;
v2 = this.max;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = com.badlogic.gdx.math.collision.BoundingBox .max ( v2,p1 );
v3 = this.max;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = com.badlogic.gdx.math.collision.BoundingBox .max ( v3,p2 );
v4 = this.max;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->z:F */
v4 = com.badlogic.gdx.math.collision.BoundingBox .max ( v4,p3 );
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).set ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/badlogic/gdx/math/collision/BoundingBox;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox ext ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 6 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
v0 = this.min;
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v1 = com.badlogic.gdx.math.collision.BoundingBox .min ( v1,v2 );
v2 = this.min;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
v2 = com.badlogic.gdx.math.collision.BoundingBox .min ( v2,v3 );
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
v3 = com.badlogic.gdx.math.collision.BoundingBox .min ( v3,v4 );
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = this.max;
v2 = this.max;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = java.lang.Math .max ( v2,v3 );
v3 = this.max;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = java.lang.Math .max ( v3,v4 );
v4 = this.max;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v5, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
v4 = java.lang.Math .max ( v4,v5 );
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).set ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/badlogic/gdx/math/collision/BoundingBox;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox ext ( com.badlogic.gdx.math.collision.BoundingBox p0 ) {
/* .locals 6 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
v0 = this.min;
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.min;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
v1 = com.badlogic.gdx.math.collision.BoundingBox .min ( v1,v2 );
v2 = this.min;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->y:F */
v2 = com.badlogic.gdx.math.collision.BoundingBox .min ( v2,v3 );
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
v4 = this.min;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->z:F */
v3 = com.badlogic.gdx.math.collision.BoundingBox .min ( v3,v4 );
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = this.max;
v2 = this.max;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
v3 = this.max;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = com.badlogic.gdx.math.collision.BoundingBox .max ( v2,v3 );
v3 = this.max;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->y:F */
v4 = this.max;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = com.badlogic.gdx.math.collision.BoundingBox .max ( v3,v4 );
v4 = this.max;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->z:F */
v5 = this.max;
/* iget v5, v5, Lcom/badlogic/gdx/math/Vector3;->z:F */
v4 = com.badlogic.gdx.math.collision.BoundingBox .max ( v4,v5 );
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).set ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/badlogic/gdx/math/collision/BoundingBox;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
} // .end method
public com.badlogic.gdx.math.Vector3 getCenter ( ) {
/* .locals 1 */
v0 = this.cnt;
} // .end method
public com.badlogic.gdx.math.Vector3 getCorners ( ) {
/* .locals 1 */
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).updateCorners ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/collision/BoundingBox;->updateCorners()V
v0 = this.crn;
} // .end method
public com.badlogic.gdx.math.Vector3 getDimensions ( ) {
/* .locals 1 */
v0 = this.dim;
} // .end method
public synchronized com.badlogic.gdx.math.Vector3 getMax ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.max;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public com.badlogic.gdx.math.Vector3 getMin ( ) {
/* .locals 1 */
v0 = this.min;
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox inf ( ) {
/* .locals 4 */
/* const/high16 v3, 0x7f800000 # Float.POSITIVE_INFINITY */
/* const/high16 v2, -0x800000 # Float.NEGATIVE_INFINITY */
int v1 = 0; // const/4 v1, 0x0
v0 = this.min;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v3, v3, v3 ); // invoke-virtual {v0, v3, v3, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.max;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v2, v2, v2 ); // invoke-virtual {v0, v2, v2, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.cnt;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v1, v1 ); // invoke-virtual {v0, v1, v1, v1}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.dim;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v1, v1 ); // invoke-virtual {v0, v1, v1, v1}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
} // .end method
public Boolean isValid ( ) {
/* .locals 2 */
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->x:F */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->y:F */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
v0 = this.min;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->z:F */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox mul ( com.badlogic.gdx.math.Matrix4 p0 ) {
/* .locals 9 */
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).updateCorners ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/collision/BoundingBox;->updateCorners()V
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).inf ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/collision/BoundingBox;->inf()Lcom/badlogic/gdx/math/collision/BoundingBox;
v0 = this.crn;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
(( com.badlogic.gdx.math.Vector3 ) v3 ).mul ( p1 ); // invoke-virtual {v3, p1}, Lcom/badlogic/gdx/math/Vector3;->mul(Lcom/badlogic/gdx/math/Matrix4;)Lcom/badlogic/gdx/math/Vector3;
v4 = this.min;
v5 = this.min;
/* iget v5, v5, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v6, v3, Lcom/badlogic/gdx/math/Vector3;->x:F */
v5 = com.badlogic.gdx.math.collision.BoundingBox .min ( v5,v6 );
v6 = this.min;
/* iget v6, v6, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v7, v3, Lcom/badlogic/gdx/math/Vector3;->y:F */
v6 = com.badlogic.gdx.math.collision.BoundingBox .min ( v6,v7 );
v7 = this.min;
/* iget v7, v7, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v8, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
v7 = com.badlogic.gdx.math.collision.BoundingBox .min ( v7,v8 );
(( com.badlogic.gdx.math.Vector3 ) v4 ).set ( v5, v6, v7 ); // invoke-virtual {v4, v5, v6, v7}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v4 = this.max;
v5 = this.max;
/* iget v5, v5, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v6, v3, Lcom/badlogic/gdx/math/Vector3;->x:F */
v5 = com.badlogic.gdx.math.collision.BoundingBox .max ( v5,v6 );
v6 = this.max;
/* iget v6, v6, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v7, v3, Lcom/badlogic/gdx/math/Vector3;->y:F */
v6 = com.badlogic.gdx.math.collision.BoundingBox .max ( v6,v7 );
v7 = this.max;
/* iget v7, v7, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
v3 = com.badlogic.gdx.math.collision.BoundingBox .max ( v7,v3 );
(( com.badlogic.gdx.math.Vector3 ) v4 ).set ( v5, v6, v3 ); // invoke-virtual {v4, v5, v6, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
v0 = this.min;
v1 = this.max;
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).set ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/badlogic/gdx/math/collision/BoundingBox;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox set ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1 ) {
/* .locals 5 */
v0 = this.min;
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_0 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
} // :goto_0
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v3, p2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_1 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
} // :goto_1
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v4, p2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpg-float v3, v3, v4 */
/* if-gez v3, :cond_2 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
} // :goto_2
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.max;
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_3 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
} // :goto_3
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v3, p2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_4 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
} // :goto_4
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v4, p2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpl-float v3, v3, v4 */
/* if-lez v3, :cond_5 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
} // :goto_5
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.cnt;
v1 = this.min;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v1 = this.max;
(( com.badlogic.gdx.math.Vector3 ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v1, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v0 = this.dim;
v1 = this.max;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v1 = this.min;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
} // :cond_0
/* iget v1, p2, Lcom/badlogic/gdx/math/Vector3;->x:F */
} // :cond_1
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->y:F */
} // :cond_2
/* iget v3, p2, Lcom/badlogic/gdx/math/Vector3;->z:F */
} // :cond_3
/* iget v1, p2, Lcom/badlogic/gdx/math/Vector3;->x:F */
} // :cond_4
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->y:F */
} // :cond_5
/* iget v3, p2, Lcom/badlogic/gdx/math/Vector3;->z:F */
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox set ( com.badlogic.gdx.math.collision.BoundingBox p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
v0 = this.min;
v1 = this.max;
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).set ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/badlogic/gdx/math/collision/BoundingBox;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox set ( java.util.List p0 ) {
/* .locals 2 */
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).inf ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/collision/BoundingBox;->inf()Lcom/badlogic/gdx/math/collision/BoundingBox;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).ext ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/collision/BoundingBox;->ext(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
} // .end method
public com.badlogic.gdx.math.collision.BoundingBox set ( com.badlogic.gdx.math.Vector3[] p0 ) {
/* .locals 3 */
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).inf ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/collision/BoundingBox;->inf()Lcom/badlogic/gdx/math/collision/BoundingBox;
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* aget-object v2, p1, v1 */
(( com.badlogic.gdx.math.collision.BoundingBox ) p0 ).ext ( v2 ); // invoke-virtual {p0, v2}, Lcom/badlogic/gdx/math/collision/BoundingBox;->ext(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/collision/BoundingBox;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.min;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.max;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
protected void updateCorners ( ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* iget-boolean v0, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = this.crn;
/* aget-object v0, v0, v4 */
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.min;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.crn;
int v1 = 1; // const/4 v1, 0x1
/* aget-object v0, v0, v1 */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.min;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.crn;
int v1 = 2; // const/4 v1, 0x2
/* aget-object v0, v0, v1 */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.max;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.crn;
int v1 = 3; // const/4 v1, 0x3
/* aget-object v0, v0, v1 */
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.max;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.crn;
int v1 = 4; // const/4 v1, 0x4
/* aget-object v0, v0, v1 */
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.min;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.max;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.crn;
int v1 = 5; // const/4 v1, 0x5
/* aget-object v0, v0, v1 */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.min;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.max;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.crn;
int v1 = 6; // const/4 v1, 0x6
/* aget-object v0, v0, v1 */
v1 = this.max;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.max;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.max;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = this.crn;
int v1 = 7; // const/4 v1, 0x7
/* aget-object v0, v0, v1 */
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v2 = this.max;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v3 = this.max;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
/* iput-boolean v4, p0, Lcom/badlogic/gdx/math/collision/BoundingBox;->crn_dirty:Z */
/* goto/16 :goto_0 */
} // .end method
