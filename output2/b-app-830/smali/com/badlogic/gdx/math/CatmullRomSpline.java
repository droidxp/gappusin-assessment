public class com.badlogic.gdx.math.CatmullRomSpline implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 com.badlogic.gdx.math.Vector3 T1;
	 com.badlogic.gdx.math.Vector3 T2;
	 private java.util.List controlPoints;
	 /* # direct methods */
	 public com.badlogic.gdx.math.CatmullRomSpline ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.controlPoints = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.T1 = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.T2 = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 1 */
		 v0 = this.controlPoints;
		 return;
	 } // .end method
	 public java.util.List getControlPoints ( ) {
		 /* .locals 1 */
		 v0 = this.controlPoints;
	 } // .end method
	 public java.util.List getPath ( Integer p0 ) {
		 /* .locals 13 */
		 /* new-instance v1, Ljava/util/ArrayList; */
		 /* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
		 v0 = 		 v0 = this.controlPoints;
		 int v2 = 4; // const/4 v2, 0x4
		 /* if-ge v0, v2, :cond_0 */
		 /* move-object v0, v1 */
	 } // :goto_0
} // :cond_0
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* new-instance v3, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v3}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* move v4, v0 */
} // :goto_1
v0 = v0 = this.controlPoints;
int v5 = 3; // const/4 v5, 0x3
/* sub-int/2addr v0, v5 */
/* if-gt v4, v0, :cond_2 */
v0 = this.controlPoints;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* const/high16 v0, 0x3f800000 # 1.0f */
/* add-int/lit8 v5, p1, 0x1 */
/* int-to-float v5, v5 */
/* div-float v5, v0, v5 */
v0 = this.controlPoints;
/* add-int/lit8 v6, v4, 0x1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v2 ).set ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
int v7 = 1; // const/4 v7, 0x1
/* sub-int v7, v4, v7 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v6 ).sub ( v0 ); // invoke-virtual {v6, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v6, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v6 ); // invoke-virtual {v0, v6}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* add-int/lit8 v6, v4, 0x2 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v3 ).set ( v0 ); // invoke-virtual {v3, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v6 ).sub ( v0 ); // invoke-virtual {v6, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v6, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v6 ); // invoke-virtual {v0, v6}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
int v0 = 0; // const/4 v0, 0x0
/* move v6, v0 */
/* move v7, v5 */
} // :goto_2
/* if-ge v6, p1, :cond_1 */
/* const/high16 v0, 0x40000000 # 2.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v8, 0x40400000 # 3.0f */
/* mul-float/2addr v8, v7 */
/* mul-float/2addr v8, v7 */
/* sub-float/2addr v0, v8 */
/* const/high16 v8, 0x3f800000 # 1.0f */
/* add-float/2addr v8, v0 */
/* const/high16 v0, -0x40000000 # -2.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v9, 0x40400000 # 3.0f */
/* mul-float/2addr v9, v7 */
/* mul-float/2addr v9, v7 */
/* add-float/2addr v9, v0 */
/* mul-float v0, v7, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v10, 0x40000000 # 2.0f */
/* mul-float/2addr v10, v7 */
/* mul-float/2addr v10, v7 */
/* sub-float/2addr v0, v10 */
/* add-float v10, v0, v7 */
/* mul-float v0, v7, v7 */
/* mul-float/2addr v0, v7 */
/* mul-float v11, v7, v7 */
/* sub-float v11, v0, v11 */
/* new-instance v12, Lcom/badlogic/gdx/math/Vector3; */
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v12, v0}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
(( com.badlogic.gdx.math.Vector3 ) v12 ).mul ( v8 ); // invoke-virtual {v12, v8}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* add-int/lit8 v12, v4, 0x1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v0 ).tmp ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v9 ); // invoke-virtual {v0, v9}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).tmp ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v10 ); // invoke-virtual {v0, v10}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v3 ).tmp ( ); // invoke-virtual {v3}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v11 ); // invoke-virtual {v0, v11}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( java.util.ArrayList ) v1 ).add ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-float v0, v7, v5 */
/* add-int/lit8 v6, v6, 0x1 */
/* move v7, v0 */
} // :cond_1
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
/* goto/16 :goto_1 */
} // :cond_2
v0 = v0 = this.controlPoints;
int v2 = 4; // const/4 v2, 0x4
/* if-lt v0, v2, :cond_3 */
v0 = this.controlPoints;
v2 = v2 = this.controlPoints;
int v3 = 2; // const/4 v3, 0x2
/* sub-int/2addr v2, v3 */
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_3
/* move-object v0, v1 */
/* goto/16 :goto_0 */
} // .end method
public void getPath ( com.badlogic.gdx.math.Vector3[] p0, Integer p1 ) {
/* .locals 12 */
int v0 = 0; // const/4 v0, 0x0
v1 = v1 = this.controlPoints;
int v2 = 4; // const/4 v2, 0x4
/* if-ge v1, v2, :cond_0 */
} // :goto_0
return;
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :goto_1
v2 = v2 = this.controlPoints;
int v3 = 3; // const/4 v3, 0x3
/* sub-int/2addr v2, v3 */
/* if-gt v1, v2, :cond_2 */
/* add-int/lit8 v2, v0, 0x1 */
/* aget-object v3, p1, v0 */
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v3 ).set ( v0 ); // invoke-virtual {v3, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v0, 0x3f800000 # 1.0f */
/* add-int/lit8 v3, p2, 0x1 */
/* int-to-float v3, v3 */
/* div-float v3, v0, v3 */
v4 = this.T1;
v0 = this.controlPoints;
/* add-int/lit8 v5, v1, 0x1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v4 ).set ( v0 ); // invoke-virtual {v4, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
int v5 = 1; // const/4 v5, 0x1
/* sub-int v5, v1, v5 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v4 ).sub ( v0 ); // invoke-virtual {v4, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v4, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v4 ); // invoke-virtual {v0, v4}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v4 = this.T2;
v0 = this.controlPoints;
/* add-int/lit8 v5, v1, 0x2 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v4 ).set ( v0 ); // invoke-virtual {v4, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v4 ).sub ( v0 ); // invoke-virtual {v4, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v4, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v4 ); // invoke-virtual {v0, v4}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
int v0 = 0; // const/4 v0, 0x0
/* move v4, v3 */
/* move v11, v0 */
/* move v0, v2 */
/* move v2, v11 */
} // :goto_2
/* if-ge v2, p2, :cond_1 */
/* const/high16 v5, 0x40000000 # 2.0f */
/* mul-float/2addr v5, v4 */
/* mul-float/2addr v5, v4 */
/* mul-float/2addr v5, v4 */
/* const/high16 v6, 0x40400000 # 3.0f */
/* mul-float/2addr v6, v4 */
/* mul-float/2addr v6, v4 */
/* sub-float/2addr v5, v6 */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* add-float/2addr v5, v6 */
/* const/high16 v6, -0x40000000 # -2.0f */
/* mul-float/2addr v6, v4 */
/* mul-float/2addr v6, v4 */
/* mul-float/2addr v6, v4 */
/* const/high16 v7, 0x40400000 # 3.0f */
/* mul-float/2addr v7, v4 */
/* mul-float/2addr v7, v4 */
/* add-float/2addr v6, v7 */
/* mul-float v7, v4, v4 */
/* mul-float/2addr v7, v4 */
/* const/high16 v8, 0x40000000 # 2.0f */
/* mul-float/2addr v8, v4 */
/* mul-float/2addr v8, v4 */
/* sub-float/2addr v7, v8 */
/* add-float/2addr v7, v4 */
/* mul-float v8, v4, v4 */
/* mul-float/2addr v8, v4 */
/* mul-float v9, v4, v4 */
/* sub-float/2addr v8, v9 */
/* add-int/lit8 v9, v0, 0x1 */
/* aget-object v10, p1, v0 */
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v10 ).set ( v0 ); // invoke-virtual {v10, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v5 ); // invoke-virtual {v0, v5}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* add-int/lit8 v10, v1, 0x1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v0 ).tmp ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v6 ); // invoke-virtual {v0, v6}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v5 ).add ( v0 ); // invoke-virtual {v5, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.T1;
(( com.badlogic.gdx.math.Vector3 ) v0 ).tmp ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v7 ); // invoke-virtual {v0, v7}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v5 ).add ( v0 ); // invoke-virtual {v5, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.T2;
(( com.badlogic.gdx.math.Vector3 ) v0 ).tmp ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v8 ); // invoke-virtual {v0, v8}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v5 ).add ( v0 ); // invoke-virtual {v5, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* add-float v0, v4, v3 */
/* add-int/lit8 v2, v2, 0x1 */
/* move v4, v0 */
/* move v0, v9 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
/* goto/16 :goto_1 */
} // :cond_2
/* aget-object v0, p1, v0 */
v1 = this.controlPoints;
v2 = v2 = this.controlPoints;
int v3 = 2; // const/4 v3, 0x2
/* sub-int/2addr v2, v3 */
/* check-cast p0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* goto/16 :goto_0 */
} // .end method
public java.util.List getTangentNormals ( Integer p0, com.badlogic.gdx.math.Vector3 p1 ) {
/* .locals 3 */
(( com.badlogic.gdx.math.CatmullRomSpline ) p0 ).getTangents ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/CatmullRomSpline;->getTangents(I)Ljava/util/List;
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast p0, Lcom/badlogic/gdx/math/Vector3; */
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2, p0}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
(( com.badlogic.gdx.math.Vector3 ) v2 ).crs ( p2 ); // invoke-virtual {v2, p2}, Lcom/badlogic/gdx/math/Vector3;->crs(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).nor ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // .end method
public java.util.List getTangentNormals ( Integer p0, java.util.List p1 ) {
/* .locals 5 */
(( com.badlogic.gdx.math.CatmullRomSpline ) p0 ).getTangents ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/CatmullRomSpline;->getTangents(I)Ljava/util/List;
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
int v2 = 0; // const/4 v2, 0x0
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast p0, Lcom/badlogic/gdx/math/Vector3; */
/* new-instance v3, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v3, p0}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
/* add-int/lit8 v4, v2, 0x1 */
/* check-cast p0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v3 ).crs ( p0 ); // invoke-virtual {v3, p0}, Lcom/badlogic/gdx/math/Vector3;->crs(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).nor ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* move v2, v4 */
} // :cond_0
} // .end method
public java.util.List getTangentNormals2D ( Integer p0 ) {
/* .locals 13 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
v0 = v0 = this.controlPoints;
int v2 = 4; // const/4 v2, 0x4
/* if-ge v0, v2, :cond_0 */
/* move-object v0, v1 */
} // :goto_0
} // :cond_0
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* new-instance v3, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v3}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* move v4, v0 */
} // :goto_1
v0 = v0 = this.controlPoints;
int v5 = 3; // const/4 v5, 0x3
/* sub-int/2addr v0, v5 */
/* if-gt v4, v0, :cond_2 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* add-int/lit8 v5, p1, 0x1 */
/* int-to-float v5, v5 */
/* div-float v5, v0, v5 */
v0 = this.controlPoints;
/* add-int/lit8 v6, v4, 0x1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v2 ).set ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
int v7 = 1; // const/4 v7, 0x1
/* sub-int v7, v4, v7 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v6 ).sub ( v0 ); // invoke-virtual {v6, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v6, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v6 ); // invoke-virtual {v0, v6}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* add-int/lit8 v6, v4, 0x2 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v3 ).set ( v0 ); // invoke-virtual {v3, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v6 ).sub ( v0 ); // invoke-virtual {v6, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v6, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v6 ); // invoke-virtual {v0, v6}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0, v2}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
/* iget v6, v0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v7, v0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iput v7, v0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* neg-float v6, v6 */
/* iput v6, v0, Lcom/badlogic/gdx/math/Vector3;->y:F */
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v0 = 0; // const/4 v0, 0x0
/* move v6, v0 */
/* move v7, v5 */
} // :goto_2
/* if-ge v6, p1, :cond_1 */
/* const/high16 v0, 0x40c00000 # 6.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v8, 0x40c00000 # 6.0f */
/* mul-float/2addr v8, v7 */
/* sub-float v8, v0, v8 */
/* const/high16 v0, -0x3f400000 # -6.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v9, 0x40c00000 # 6.0f */
/* mul-float/2addr v9, v7 */
/* add-float/2addr v9, v0 */
/* const/high16 v0, 0x40400000 # 3.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v10, 0x40800000 # 4.0f */
/* mul-float/2addr v10, v7 */
/* sub-float/2addr v0, v10 */
/* const/high16 v10, 0x3f800000 # 1.0f */
/* add-float/2addr v10, v0 */
/* const/high16 v0, 0x40400000 # 3.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v11, 0x40000000 # 2.0f */
/* mul-float/2addr v11, v7 */
/* sub-float v11, v0, v11 */
/* new-instance v12, Lcom/badlogic/gdx/math/Vector3; */
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v12, v0}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
(( com.badlogic.gdx.math.Vector3 ) v12 ).mul ( v8 ); // invoke-virtual {v12, v8}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* add-int/lit8 v12, v4, 0x1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v0 ).tmp ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v9 ); // invoke-virtual {v0, v9}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).tmp ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v10 ); // invoke-virtual {v0, v10}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v3 ).tmp ( ); // invoke-virtual {v3}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v11 ); // invoke-virtual {v0, v11}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).nor ( ); // invoke-virtual {v8}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
/* iget v0, v8, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v9, v8, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iput v9, v8, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* neg-float v0, v0 */
/* iput v0, v8, Lcom/badlogic/gdx/math/Vector3;->y:F */
(( java.util.ArrayList ) v1 ).add ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-float v0, v7, v5 */
/* add-int/lit8 v6, v6, 0x1 */
/* move v7, v0 */
} // :cond_1
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
/* goto/16 :goto_1 */
} // :cond_2
/* move-object v0, v1 */
/* goto/16 :goto_0 */
} // .end method
public java.util.List getTangents ( Integer p0 ) {
/* .locals 13 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
v0 = v0 = this.controlPoints;
int v2 = 4; // const/4 v2, 0x4
/* if-ge v0, v2, :cond_0 */
/* move-object v0, v1 */
} // :goto_0
} // :cond_0
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* new-instance v3, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v3}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* move v4, v0 */
} // :goto_1
v0 = v0 = this.controlPoints;
int v5 = 3; // const/4 v5, 0x3
/* sub-int/2addr v0, v5 */
/* if-gt v4, v0, :cond_2 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* add-int/lit8 v5, p1, 0x1 */
/* int-to-float v5, v5 */
/* div-float v5, v0, v5 */
v0 = this.controlPoints;
/* add-int/lit8 v6, v4, 0x1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v2 ).set ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
int v7 = 1; // const/4 v7, 0x1
/* sub-int v7, v4, v7 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v6 ).sub ( v0 ); // invoke-virtual {v6, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v6, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v6 ); // invoke-virtual {v0, v6}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* add-int/lit8 v6, v4, 0x2 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v3 ).set ( v0 ); // invoke-virtual {v3, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v6 ).sub ( v0 ); // invoke-virtual {v6, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v6, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v6 ); // invoke-virtual {v0, v6}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v0, v2}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v0 = 0; // const/4 v0, 0x0
/* move v6, v0 */
/* move v7, v5 */
} // :goto_2
/* if-ge v6, p1, :cond_1 */
/* const/high16 v0, 0x40c00000 # 6.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v8, 0x40c00000 # 6.0f */
/* mul-float/2addr v8, v7 */
/* sub-float v8, v0, v8 */
/* const/high16 v0, -0x3f400000 # -6.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v9, 0x40c00000 # 6.0f */
/* mul-float/2addr v9, v7 */
/* add-float/2addr v9, v0 */
/* const/high16 v0, 0x40400000 # 3.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v10, 0x40800000 # 4.0f */
/* mul-float/2addr v10, v7 */
/* sub-float/2addr v0, v10 */
/* const/high16 v10, 0x3f800000 # 1.0f */
/* add-float/2addr v10, v0 */
/* const/high16 v0, 0x40400000 # 3.0f */
/* mul-float/2addr v0, v7 */
/* mul-float/2addr v0, v7 */
/* const/high16 v11, 0x40000000 # 2.0f */
/* mul-float/2addr v11, v7 */
/* sub-float v11, v0, v11 */
/* new-instance v12, Lcom/badlogic/gdx/math/Vector3; */
v0 = this.controlPoints;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v12, v0}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
(( com.badlogic.gdx.math.Vector3 ) v12 ).mul ( v8 ); // invoke-virtual {v12, v8}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
v0 = this.controlPoints;
/* add-int/lit8 v12, v4, 0x1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v0 ).tmp ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v9 ); // invoke-virtual {v0, v9}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).tmp ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v10 ); // invoke-virtual {v0, v10}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v3 ).tmp ( ); // invoke-virtual {v3}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v11 ); // invoke-virtual {v0, v11}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v8 ).nor ( ); // invoke-virtual {v8}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-float v0, v7, v5 */
/* add-int/lit8 v6, v6, 0x1 */
/* move v7, v0 */
} // :cond_1
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
/* goto/16 :goto_1 */
} // :cond_2
v0 = v0 = this.controlPoints;
int v3 = 4; // const/4 v3, 0x4
/* if-lt v0, v3, :cond_3 */
v0 = this.controlPoints;
v3 = v3 = this.controlPoints;
int v4 = 1; // const/4 v4, 0x1
/* sub-int/2addr v3, v4 */
/* check-cast p1, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v2 ).set ( p1 ); // invoke-virtual {v2, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v2 = this.controlPoints;
v3 = v3 = this.controlPoints;
int v4 = 3; // const/4 v4, 0x3
/* sub-int/2addr v3, v4 */
/* check-cast p0, Lcom/badlogic/gdx/math/Vector3; */
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v2, 0x3f000000 # 0.5f */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v2 ); // invoke-virtual {v0, v2}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).cpy ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->cpy()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_3
/* move-object v0, v1 */
/* goto/16 :goto_0 */
} // .end method
