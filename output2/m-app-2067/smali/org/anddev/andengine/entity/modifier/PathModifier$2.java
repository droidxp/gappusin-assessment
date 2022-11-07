class org.anddev.andengine.entity.modifier.PathModifier$2 implements org.anddev.andengine.entity.modifier.IEntityModifier$IEntityModifierListener {
	 /* # interfaces */
	 /* # instance fields */
	 final org.anddev.andengine.entity.modifier.PathModifier this$0; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.entity.modifier.PathModifier$2 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onModifierFinished ( org.anddev.andengine.util.modifier.IModifier p0, java.lang.Object p1 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* check-cast p1, Lorg/anddev/andengine/util/modifier/IModifier; */
		 /* check-cast p2, Lorg/anddev/andengine/entity/IEntity; */
		 (( org.anddev.andengine.entity.modifier.PathModifier$2 ) p0 ).onModifierFinished ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/modifier/PathModifier$2;->onModifierFinished(Lorg/anddev/andengine/util/modifier/IModifier;Lorg/anddev/andengine/entity/IEntity;)V
		 return;
	 } // .end method
	 public void onModifierFinished ( org.anddev.andengine.util.modifier.IModifier p0, org.anddev.andengine.entity.IEntity p1 ) {
		 /* .locals 2 */
		 v0 = this.this$0;
		 org.anddev.andengine.entity.modifier.PathModifier .access$5 ( v0,p2 );
		 v0 = this.this$0;
		 org.anddev.andengine.entity.modifier.PathModifier .access$3 ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.this$0;
			 org.anddev.andengine.entity.modifier.PathModifier .access$3 ( v0 );
			 v1 = this.this$0;
		 } // :cond_0
		 return;
	 } // .end method
	 public void onModifierStarted ( org.anddev.andengine.util.modifier.IModifier p0, java.lang.Object p1 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* check-cast p1, Lorg/anddev/andengine/util/modifier/IModifier; */
		 /* check-cast p2, Lorg/anddev/andengine/entity/IEntity; */
		 (( org.anddev.andengine.entity.modifier.PathModifier$2 ) p0 ).onModifierStarted ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/modifier/PathModifier$2;->onModifierStarted(Lorg/anddev/andengine/util/modifier/IModifier;Lorg/anddev/andengine/entity/IEntity;)V
		 return;
	 } // .end method
	 public void onModifierStarted ( org.anddev.andengine.util.modifier.IModifier p0, org.anddev.andengine.entity.IEntity p1 ) {
		 /* .locals 2 */
		 v0 = this.this$0;
		 org.anddev.andengine.entity.modifier.PathModifier .access$4 ( v0,p2 );
		 v0 = this.this$0;
		 org.anddev.andengine.entity.modifier.PathModifier .access$3 ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.this$0;
			 org.anddev.andengine.entity.modifier.PathModifier .access$3 ( v0 );
			 v1 = this.this$0;
		 } // :cond_0
		 return;
	 } // .end method
