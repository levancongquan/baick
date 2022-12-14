// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMotaDowloadBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnOrderfood;

  @NonNull
  public final ImageView imgMoTa;

  @NonNull
  public final TextView txtGiaMota;

  @NonNull
  public final TextView txtMoTa;

  @NonNull
  public final TextView txtMotaTenfood;

  private FragmentMotaDowloadBinding(@NonNull LinearLayout rootView, @NonNull Button btnOrderfood,
      @NonNull ImageView imgMoTa, @NonNull TextView txtGiaMota, @NonNull TextView txtMoTa,
      @NonNull TextView txtMotaTenfood) {
    this.rootView = rootView;
    this.btnOrderfood = btnOrderfood;
    this.imgMoTa = imgMoTa;
    this.txtGiaMota = txtGiaMota;
    this.txtMoTa = txtMoTa;
    this.txtMotaTenfood = txtMotaTenfood;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMotaDowloadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMotaDowloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_mota_dowload, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMotaDowloadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_orderfood;
      Button btnOrderfood = ViewBindings.findChildViewById(rootView, id);
      if (btnOrderfood == null) {
        break missingId;
      }

      id = R.id.imgMoTa;
      ImageView imgMoTa = ViewBindings.findChildViewById(rootView, id);
      if (imgMoTa == null) {
        break missingId;
      }

      id = R.id.txt_gia_mota;
      TextView txtGiaMota = ViewBindings.findChildViewById(rootView, id);
      if (txtGiaMota == null) {
        break missingId;
      }

      id = R.id.txt_mo_ta;
      TextView txtMoTa = ViewBindings.findChildViewById(rootView, id);
      if (txtMoTa == null) {
        break missingId;
      }

      id = R.id.txt_mota_tenfood;
      TextView txtMotaTenfood = ViewBindings.findChildViewById(rootView, id);
      if (txtMotaTenfood == null) {
        break missingId;
      }

      return new FragmentMotaDowloadBinding((LinearLayout) rootView, btnOrderfood, imgMoTa,
          txtGiaMota, txtMoTa, txtMotaTenfood);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
