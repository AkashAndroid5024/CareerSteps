package com.example.careersteps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WebinarsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var webinarAdapter: WebinarAdapter
    private val webinars: ArrayList<Webinar> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):  View? {
        val view = inflater.inflate(R.layout.fragment_webinars, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewWebinars)
        webinarAdapter = WebinarAdapter(webinars) { webinar ->
            showWebinarDetailsDialog(webinar)
        }
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = webinarAdapter

        // Add sample webinars (replace this with your actual webinar data)
        addSampleWebinars()

        return view
    }

    private fun addSampleWebinars() {
        webinars.add(Webinar("Introduction to Machine Learning", "April 15, 2024 | 10:00 AM", "https://example.com/machine-learning"))
        webinars.add(Webinar("Android App Development Workshop", "April 20, 2024 | 2:00 PM", "https://example.com/android-app-development"))
        webinars.add(Webinar("Career Guidance Seminar", "April 25, 2024 | 4:00 PM", "https://example.com/career-guidance"))
        webinars.add(Webinar("Creative Writing Masterclass", "April 30, 2024 | 6:00 PM", "https://example.com/creative-writing"))
        webinars.add(Webinar("Financial Literacy Training", "May 5, 2024 | 9:00 AM", "https://example.com/financial-literacy"))
        webinars.add(Webinar("Artificial Intelligence Conference", "May 10, 2024 | 11:00 AM", "https://example.com/ai-conference"))
        webinars.add(Webinar("Public Speaking Workshop", "May 15, 2024 | 3:00 PM", "https://example.com/public-speaking"))
        webinars.add(Webinar("Photography Basics Tutorial", "May 20, 2024 | 5:00 PM", "https://example.com/photography-basics"))
        webinars.add(Webinar("Entrepreneurship Bootcamp", "May 25, 2024 | 7:00 PM", "https://example.com/entrepreneurship-bootcamp"))
        webinars.add(Webinar("Health and Fitness Seminar", "May 30, 2024 | 8:00 PM", "https://example.com/health-and-fitness"))
        webinarAdapter.notifyDataSetChanged()
    }

    private fun showWebinarDetailsDialog(webinar: Webinar) {
        val dialogView = layoutInflater.inflate(R.layout.dialog_webinar_details, null)
        val dialogBuilder = AlertDialog.Builder(requireContext())
            .setView(dialogView)
            .setTitle("Webinar Details")

        val webinarNameTextView = dialogView.findViewById<TextView>(R.id.textViewWebinarNameDialog)
        val webinarTimeTextView = dialogView.findViewById<TextView>(R.id.textViewWebinarTimeDialog)
        val meetingLinkTextView = dialogView.findViewById<TextView>(R.id.textViewMeetingLink)

        webinarNameTextView.text = webinar.name
        webinarTimeTextView.text = webinar.time
        meetingLinkTextView.text = webinar.meetingLink

        dialogBuilder.setPositiveButton("Close") { dialog, _ ->
            dialog.dismiss()
        }

        val dialog = dialogBuilder.create()
        dialog.show()
    }
}

data class Webinar(val name: String, val time: String, val meetingLink: String)

