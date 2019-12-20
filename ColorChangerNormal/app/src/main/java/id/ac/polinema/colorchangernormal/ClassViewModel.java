package id.ac.polinema.colorchangernormal;

import android.app.Application;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProviders;

public class ColorViewModel extends AndroidViewModel {

    private int color = 0xfff;
    ConstraintLayout rootView;
    Button btnChangeColor;
    // Tambahkan ViewModel
    ColorViewModel colorViewModel;
    colorViewModel = ViewModelProviders.of(this).get(ColorViewModel.class);
    colorViewModel.setColor(color);

    public ColorViewModel(@NonNull Application application) {
        super(application);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
