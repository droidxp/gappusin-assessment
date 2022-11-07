public class org.anddev.andengine.entity.modifier.PathModifier extends org.anddev.andengine.entity.modifier.EntityModifier {
	 /* # instance fields */
	 private final org.anddev.andengine.entity.modifier.PathModifier$Path mPath;
	 private org.anddev.andengine.entity.modifier.PathModifier$IPathModifierListener mPathModifierListener;
	 private final org.anddev.andengine.util.modifier.SequenceModifier mSequenceModifier;
	 /* # direct methods */
	 public org.anddev.andengine.entity.modifier.PathModifier ( ) {
		 /* .locals 6 */
		 int v3 = 0; // const/4 v3, 0x0
		 v5 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v4, v3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/modifier/PathModifier;-><init>(FLorg/anddev/andengine/entity/modifier/PathModifier$Path;Lorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;Lorg/anddev/andengine/entity/modifier/PathModifier$IPathModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.modifier.PathModifier ( ) {
		 /* .locals 6 */
		 int v4 = 0; // const/4 v4, 0x0
		 v5 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/modifier/PathModifier;-><init>(FLorg/anddev/andengine/entity/modifier/PathModifier$Path;Lorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;Lorg/anddev/andengine/entity/modifier/PathModifier$IPathModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.modifier.PathModifier ( ) {
		 /* .locals 6 */
		 v5 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/modifier/PathModifier;-><init>(FLorg/anddev/andengine/entity/modifier/PathModifier$Path;Lorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;Lorg/anddev/andengine/entity/modifier/PathModifier$IPathModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.modifier.PathModifier ( ) {
		 /* .locals 16 */
		 /* move-object/from16 v0, p0 */
		 /* move-object/from16 v1, p3 */
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/entity/modifier/EntityModifier;-><init>(Lorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
		 v2 = 		 /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->getSize()I */
		 int v3 = 2; // const/4 v3, 0x2
		 /* if-ge v2, v3, :cond_0 */
		 /* new-instance v2, Ljava/lang/IllegalArgumentException; */
		 final String v3 = "Path needs at least 2 waypoints!"; // const-string v3, "Path needs at least 2 waypoints!"
		 /* invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v2 */
	 } // :cond_0
	 /* move-object/from16 v0, p2 */
	 /* move-object/from16 v1, p0 */
	 this.mPath = v0;
	 /* move-object/from16 v0, p4 */
	 /* move-object/from16 v1, p0 */
	 this.mPathModifierListener = v0;
	 int v3 = 1; // const/4 v3, 0x1
	 /* sub-int/2addr v2, v3 */
	 /* new-array v10, v2, [Lorg/anddev/andengine/entity/modifier/MoveModifier; */
	 /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->getCoordinatesX()[F */
	 /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->getCoordinatesY()[F */
	 v2 = 	 /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->getLength()F */
	 /* div-float v13, v2, p1 */
	 /* array-length v14, v10 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* move v15, v2 */
} // :goto_0
/* if-lt v15, v14, :cond_1 */
/* new-instance v2, Lorg/anddev/andengine/util/modifier/SequenceModifier; */
/* new-instance v3, Lorg/anddev/andengine/entity/modifier/PathModifier$1; */
/* move-object v0, v3 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1}, Lorg/anddev/andengine/entity/modifier/PathModifier$1;-><init>(Lorg/anddev/andengine/entity/modifier/PathModifier;)V */
/* new-instance v4, Lorg/anddev/andengine/entity/modifier/PathModifier$2; */
/* move-object v0, v4 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1}, Lorg/anddev/andengine/entity/modifier/PathModifier$2;-><init>(Lorg/anddev/andengine/entity/modifier/PathModifier;)V */
/* invoke-direct {v2, v3, v4, v10}, Lorg/anddev/andengine/util/modifier/SequenceModifier;-><init>(Lorg/anddev/andengine/util/modifier/SequenceModifier$ISubSequenceModifierListener;Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;[Lorg/anddev/andengine/util/modifier/IModifier;)V */
/* move-object v0, v2 */
/* move-object/from16 v1, p0 */
this.mSequenceModifier = v0;
return;
} // :cond_1
/* move-object/from16 v0, p2 */
/* move v1, v15 */
v2 = (( org.anddev.andengine.entity.modifier.PathModifier$Path ) v0 ).getSegmentLength ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->getSegmentLength(I)F
/* div-float v3, v2, v13 */
/* new-instance v2, Lorg/anddev/andengine/entity/modifier/MoveModifier; */
/* aget v4, v11, v15 */
/* add-int/lit8 v5, v15, 0x1 */
/* aget v5, v11, v5 */
/* aget v6, v12, v15 */
/* add-int/lit8 v7, v15, 0x1 */
/* aget v7, v12, v7 */
int v8 = 0; // const/4 v8, 0x0
/* move-object/from16 v9, p5 */
/* invoke-direct/range {v2 ..v9}, Lorg/anddev/andengine/entity/modifier/MoveModifier;-><init>(FFFFFLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
/* aput-object v2, v10, v15 */
/* add-int/lit8 v2, v15, 0x1 */
/* move v15, v2 */
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier ( ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/modifier/PathModifier;-><init>(FLorg/anddev/andengine/entity/modifier/PathModifier$Path;Lorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;Lorg/anddev/andengine/entity/modifier/PathModifier$IPathModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
return;
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier ( ) {
/* .locals 6 */
int v3 = 0; // const/4 v3, 0x0
v5 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
/* move-object v0, p0 */
/* move v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p3 */
/* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/modifier/PathModifier;-><init>(FLorg/anddev/andengine/entity/modifier/PathModifier$Path;Lorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;Lorg/anddev/andengine/entity/modifier/PathModifier$IPathModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
return;
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier ( ) {
/* .locals 6 */
int v3 = 0; // const/4 v3, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/modifier/PathModifier;-><init>(FLorg/anddev/andengine/entity/modifier/PathModifier$Path;Lorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;Lorg/anddev/andengine/entity/modifier/PathModifier$IPathModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
return;
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier ( ) {
/* .locals 6 */
int v3 = 0; // const/4 v3, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move-object v2, p2 */
/* move-object v4, v3 */
/* move-object v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/modifier/PathModifier;-><init>(FLorg/anddev/andengine/entity/modifier/PathModifier$Path;Lorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;Lorg/anddev/andengine/entity/modifier/PathModifier$IPathModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
return;
} // .end method
protected org.anddev.andengine.entity.modifier.PathModifier ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/modifier/EntityModifier;-><init>()V */
v0 = this.mPath;
(( org.anddev.andengine.entity.modifier.PathModifier$Path ) v0 ).clone ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->clone()Lorg/anddev/andengine/entity/modifier/PathModifier$Path;
this.mPath = v0;
v0 = this.mSequenceModifier;
(( org.anddev.andengine.util.modifier.SequenceModifier ) v0 ).clone ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->clone()Lorg/anddev/andengine/util/modifier/SequenceModifier;
this.mSequenceModifier = v0;
return;
} // .end method
static org.anddev.andengine.entity.modifier.PathModifier$IPathModifierListener access$3 ( org.anddev.andengine.entity.modifier.PathModifier p0 ) { //synthethic
/* .locals 1 */
v0 = this.mPathModifierListener;
} // .end method
static void access$4 ( org.anddev.andengine.entity.modifier.PathModifier p0, java.lang.Object p1 ) { //synthethic
/* .locals 0 */
(( org.anddev.andengine.entity.modifier.PathModifier ) p0 ).onModifierStarted ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/modifier/PathModifier;->onModifierStarted(Ljava/lang/Object;)V
return;
} // .end method
static void access$5 ( org.anddev.andengine.entity.modifier.PathModifier p0, java.lang.Object p1 ) { //synthethic
/* .locals 0 */
(( org.anddev.andengine.entity.modifier.PathModifier ) p0 ).onModifierFinished ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/modifier/PathModifier;->onModifierFinished(Ljava/lang/Object;)V
return;
} // .end method
/* # virtual methods */
public org.anddev.andengine.entity.modifier.IEntityModifier clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.entity.modifier.PathModifier ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/modifier/PathModifier;->clone()Lorg/anddev/andengine/entity/modifier/PathModifier;
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier clone ( ) {
/* .locals 1 */
/* new-instance v0, Lorg/anddev/andengine/entity/modifier/PathModifier; */
/* invoke-direct {v0, p0}, Lorg/anddev/andengine/entity/modifier/PathModifier;-><init>(Lorg/anddev/andengine/entity/modifier/PathModifier;)V */
} // .end method
public org.anddev.andengine.util.modifier.IModifier clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.entity.modifier.PathModifier ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/modifier/PathModifier;->clone()Lorg/anddev/andengine/entity/modifier/PathModifier;
} // .end method
public Float getDuration ( ) {
/* .locals 1 */
v0 = this.mSequenceModifier;
v0 = (( org.anddev.andengine.util.modifier.SequenceModifier ) v0 ).getDuration ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->getDuration()F
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier$Path getPath ( ) {
/* .locals 1 */
v0 = this.mPath;
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier$IPathModifierListener getPathModifierListener ( ) {
/* .locals 1 */
v0 = this.mPathModifierListener;
} // .end method
public Float getSecondsElapsed ( ) {
/* .locals 1 */
v0 = this.mSequenceModifier;
v0 = (( org.anddev.andengine.util.modifier.SequenceModifier ) v0 ).getSecondsElapsed ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->getSecondsElapsed()F
} // .end method
public Boolean isFinished ( ) {
/* .locals 1 */
v0 = this.mSequenceModifier;
v0 = (( org.anddev.andengine.util.modifier.SequenceModifier ) v0 ).isFinished ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->isFinished()Z
} // .end method
public Float onUpdate ( Float p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 1 */
/* check-cast p2, Lorg/anddev/andengine/entity/IEntity; */
v0 = (( org.anddev.andengine.entity.modifier.PathModifier ) p0 ).onUpdate ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/modifier/PathModifier;->onUpdate(FLorg/anddev/andengine/entity/IEntity;)F
} // .end method
public Float onUpdate ( Float p0, org.anddev.andengine.entity.IEntity p1 ) {
/* .locals 1 */
v0 = this.mSequenceModifier;
v0 = (( org.anddev.andengine.util.modifier.SequenceModifier ) v0 ).onUpdate ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->onUpdate(FLjava/lang/Object;)F
} // .end method
public void reset ( ) {
/* .locals 1 */
v0 = this.mSequenceModifier;
(( org.anddev.andengine.util.modifier.SequenceModifier ) v0 ).reset ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->reset()V
return;
} // .end method
public void setPathModifierListener ( org.anddev.andengine.entity.modifier.PathModifier$IPathModifierListener p0 ) {
/* .locals 0 */
this.mPathModifierListener = p1;
return;
} // .end method
