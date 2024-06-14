package com.example.practiceprojects.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.practiceprojects.R
import com.example.practiceprojects.databinding.FragmentAddEmployeesBinding


class AddEmployeesFragment : Fragment() {

    lateinit var binding: FragmentAddEmployeesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentAddEmployeesBinding.inflate(inflater,container,false)
        //code written here...
        val positionList= arrayOf("Sales Person","Team Lead","Head","Manufacturer")
        val adapter=ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,positionList)
        val autoComplete=binding.autoCompleteListofposition
        autoComplete.setAdapter(adapter)
        autoComplete.setDropDownBackgroundResource(R.drawable.list_bottomsheetbg)


        // Set an OnClickListener to show dropdown when AutoCompleteTextView is clicked
        autoComplete.setOnClickListener {
            autoComplete.threshold=1
            autoComplete.requestFocus()
            autoComplete.showDropDown()

        }
        return binding.root
    }
    override fun onResume() {
        super.onResume()
        val positionList = arrayOf("Sales Person", "Team Lead", "Head", "Manufacturer")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, positionList)
        binding.autoCompleteListofposition.setAdapter(adapter)

    }

}